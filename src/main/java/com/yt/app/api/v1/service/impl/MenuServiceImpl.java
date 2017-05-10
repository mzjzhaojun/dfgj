package com.yt.app.api.v1.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.app.annotation.DataSourceAnnotation;
import com.yt.app.api.v1.mapper.AccountRoleMapper;
import com.yt.app.api.v1.mapper.ButtonMapper;
import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.LinkMapper;
import com.yt.app.api.v1.mapper.MenuLinksMapper;
import com.yt.app.api.v1.mapper.MenuMapper;
import com.yt.app.api.v1.mapper.RoleMenuMapper;
import com.yt.app.api.v1.mapper.RoleModulbuttonMapper;
import com.yt.app.api.v1.mapper.SysMapper;
import com.yt.app.api.v1.service.MenuService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.enums.DataSourceEnum;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.api.v1.entity.AccountRole;
import com.yt.app.api.v1.entity.Button;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Link;
import com.yt.app.api.v1.entity.Menu;
import com.yt.app.api.v1.entity.MenuLinks;
import com.yt.app.api.v1.entity.RoleMenu;
import com.yt.app.api.v1.entity.RoleModulbutton;
import com.yt.app.api.v1.entity.Sys;

/**
 * @author zgp default
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu, Long> implements MenuService {
	@Autowired
	private MenuMapper mapper;
	@Autowired
	private MenuLinksMapper MenuLinksMapper;
	@Autowired
	private LinkMapper linkMapper;
	@Autowired
	private SysMapper sysMapper;
	@Autowired
	private AccountRoleMapper accountRoleMapper;
	@Autowired
	private RoleMenuMapper roleMenuMapper;
	@Autowired
	private DictionaryMapper dictionaryMapper;
	@Autowired
	private RoleModulbuttonMapper rolemodulbuttonmapper;
	@Autowired
	private ButtonMapper buttonmapper;

	@Override
	@Transactional
	public Integer add(Menu menu) {
		if (menu.getParent_id() == null || menu.getParent_id().equals("")) {// 没有选择父级则默认一级
			menu.setLevel(DictionaryResource.MENU_LEVLE_1);
		}
		int i = this.mapper.post(menu);
		if (i > 0 && menu.getLinks_id() != null && !menu.getLinks_id().equals("")) {// 菜单插入成功后，进行关联表的插入操作
			String[] mlsIds = menu.getLinks_id().split(",");
			MenuLinks mls = null;
			for (String id : mlsIds) {
				mls = new MenuLinks(null, menu.getId(), Long.valueOf(id), null);
				this.MenuLinksMapper.post(mls);
			}
		}
		return i;
	}

	@Override
	public List<Menu> getlist() {

		List<Menu> listmeun = mapper.getlist();
		List<Menu> listlevelmeun = mapper.getlistlevel();
		/**
		 * 关联添加父级树
		 * 
		 * @author huanghao
		 * 
		 */
		long[] getsysid = listlevelmeun.stream().mapToLong(Menu::getSys_id).distinct().toArray();
		List<Sys> getlistsys = sysMapper.listByArrayId(getsysid);
		listmeun.stream().forEach(Menu -> {
			getlistsys.stream().forEach(Sys -> {
				if (Menu.getSys_id().doubleValue() == (Sys.getId().doubleValue()) && Menu.getLevel().equals(DictionaryResource.MENU_LEVEL)) {
					Menu.setParent_id(Sys.getId().toString());
					Menu.setPId(Sys.getId().toString());
					return;
				}
			});
		});
		Menu menu;
		for (Sys sys : getlistsys) {
			menu = new Menu();
			menu.setPId(DictionaryResource.MENU_PID);
			menu.setName(sys.getName());
			menu.setId(sys.getId());
			listmeun.add(menu);
		}

		return listmeun;
	}

	@Override
	@Transactional
	public Integer update(Menu menu) {
		int i = this.mapper.put(menu);
		if (i > 0 && menu.getLinks_id() != null && !menu.getLinks_id().equals("")) {// 菜单修改成功后，进行关联表的重置操作
			this.MenuLinksMapper.deleteByMenuId(menu.getId());// 删除原关联所有数据
			String[] mlsIds = menu.getLinks_id().split(",");
			MenuLinks mls = null;
			for (String id : mlsIds) {// 插入新关联所有数据
				mls = new MenuLinks(null, menu.getId(), Long.valueOf(id), null);
				this.MenuLinksMapper.post(mls);
			}
		}
		return null;
	}

	@Override
	@Transactional
	public Integer delete(Long id) {
		int i = this.mapper.delete(id);
		if (i > 0) {// 菜单删除成功后删除对应的关联链接
			this.MenuLinksMapper.deleteByMenuId(id);
		}
		return i;
	}

	@Override
	public List<Link> listLinks(Map<String, Object> param) {
		List<MenuLinks> mLinks = this.MenuLinksMapper.list(param);
		long[] obj = mLinks.stream().mapToLong(MenuLinks::getLinks_id).distinct().toArray();
		if (obj != null && obj.length > 0) {
			List<Link> links = this.linkMapper.listByArrayId(obj);

			return links;
		} else {
			return new ArrayList<Link>();
		}

	}

	@Override
	public Map<String, Object> sysmenu(Map<String, Object> param) {
		Map<String, Object> map = new HashMap<String, Object>();
		/**
		 * 菜单与角色关联（查询角色权限） userid(必须传值)
		 */
		AccountRole ar = this.accountRoleMapper.getbyaccountid((long) param.get("userid"));
		map.put("role_id", ar.getRole_id());
		List<RoleMenu> ml = this.roleMenuMapper.list(map);
		long[] obj = ml.stream().mapToLong(RoleMenu::getMenu_id).distinct().toArray();
		map.clear();
		/**
		 * 1:先获取所有一级系统
		 */
		map.put("level", DictionaryResource.MENU_LEVLE_1);
		List<Sys> listsys = sysMapper.sysmune(map);
		/**
		 * 2:循环所有一级系统，加载其对应的二级系统(暂只存在两级)
		 */
		map.put("level", DictionaryResource.MENU_LEVLE_2);
		listsys.stream().forEach(Sys -> {
			map.put("parent_id", Sys.getId());
			List<Sys> childSys = this.sysMapper.sysmune(map);
			Sys.setChild(childSys);
		});
		/**
		 * 3:循环一级系统下的子系统获取对应菜单
		 */
		listsys.stream().forEach(Sys -> {
			List<Sys> childSys = Sys.getChild();// 获取子集
				if (!childSys.isEmpty()) {// 无子集规避 或者不是需要加载的系统
					childSys.stream().forEach(Sysc -> {
						Sysc.setMenus(menus(Sysc, obj, ar.getRole_id()));
					});
				}

			});
		List<Sys> remove = new ArrayList<Sys>();
		listsys.stream().forEach(sys -> {// 循环所有二级移除所有无菜单的二级系统
					remove.clear();
					List<Sys> list = sys.getChild();
					list.stream().forEach(child -> {
						if (child != null) {// 会循环size+1次
								if (child.getMenus() == null || child.getMenus().isEmpty()) {
									remove.add(child);
								}
							}
						});

					list.removeAll(remove);
				});
		remove.clear();
		listsys.stream().forEach(sys -> {// 循环所有一级系统移除所有没有二级系统的
					List<Sys> list = sys.getChild();
					if (list.isEmpty()) {
						remove.add(sys);
					}
				});
		listsys.removeAll(remove);
		param.put("sysmenu", listsys);
		return param;
	}

	public List<Link> menuLinks(Long menuId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("menu_id", menuId);
		List<MenuLinks> mls = this.MenuLinksMapper.list(map);
		long[] obj = mls.stream().mapToLong(MenuLinks::getLinks_id).distinct().toArray();
		if (obj != null && obj.length > 0) {
			List<Link> links = this.linkMapper.listByArrayId(obj);
			return links;
		} else {
			return null;
		}

	}

	public List<Button> menuButtons(Long menuId, Long roleId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("modul_id", menuId);
		map.put("role_id", roleId);
		List<RoleModulbutton> mls = rolemodulbuttonmapper.getButtonByModul(map);
		if (mls.size() == 0)
			return null;
		long[] ids = mls.stream().mapToLong(RoleModulbutton::getButton_id).distinct().toArray();
		return buttonmapper.listByArrayId(ids);
	}

	/**
	 * 加载系统下菜单
	 * 
	 * @param sys
	 * @return
	 */
	public List<Menu> menus(Sys sys, long[] ids, Long roleid) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("level", DictionaryResource.MENU_LEVLE_1);
		map.put("sys_id", sys.getId());
		map.put("array", ids);
		List<Menu> menus = this.mapper.sysmenu(map);// 获取对应系统下所有一级菜单
		if (!menus.isEmpty()) {// 加载对应的二级菜单
			map.put("level", DictionaryResource.MENU_LEVLE_2);
			menus.stream().forEach(Menu -> {
				Menu.setLinks(menuLinks(Menu.getId()));// 加载一级菜单下link
					Menu.setButtons(menuButtons(Menu.getId(), roleid));
					map.put("parent_id", Menu.getId());
					List<Menu> child = this.mapper.sysmenu(map);// 获取对应子系统下对应一级菜单的子集菜单
					if (!child.isEmpty()) {// 加载二级菜单下link
						child.stream().forEach(c -> {
							c.setLinks(menuLinks(c.getId()));
							c.setButtons(menuButtons(c.getId(), roleid));
						});
					}
					Menu.setChild(child);
				});
		}
		return menus;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	@DataSourceAnnotation(datasource = DataSourceEnum.SLAVE)
	public IPage<Menu> list(Map<String, Object> param) {
		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0)
				return PageBean.EMPTY_PAGE;
		}
		List<Menu> list = this.mapper.list(param);
		long[] obj = list.stream().mapToLong(Menu::getSys_id).distinct().toArray();
		List<Sys> syss = this.sysMapper.listByArrayId(obj);
		// 清除所有条件用于查询所有的字典，防止以后typecode改变
		List<Dictionary> diclist = this.dictionaryMapper.list(new HashMap<String, Object>());
		list.stream().forEach(menu -> {
			syss.stream().forEach(sys -> {
				if (menu.getSys_id().longValue() == sys.getId().longValue()) {
					menu.setSys_name(sys.getName());
				}
			});
			diclist.stream().forEach(dic -> {
				if (dic.getCode().longValue() == menu.getLevel().longValue()) {
					menu.setLevel_name(dic.getName());
				}
			});
		});

		return new PageBean<Menu>(param, list, count);
	}

	@Override
	@Transactional
	public Integer updatesortno(Map<String, Object> param) {
		Integer i = this.mapper.updatestorn(param);
		return i;
	}
}