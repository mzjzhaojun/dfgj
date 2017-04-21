package com.yt.app.api.v1.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.app.api.v1.mapper.DictionaryMapper;
import com.yt.app.api.v1.mapper.MenuMapper;
import com.yt.app.api.v1.mapper.RoleMapper;
import com.yt.app.api.v1.mapper.RoleMenuMapper;
import com.yt.app.api.v1.mapper.SysMapper;
import com.yt.app.api.v1.service.RoleService;
import com.yt.app.common.base.impl.BaseServiceImpl;
import com.yt.app.common.resource.DictionaryResource;
import com.yt.app.frame.generate.GenerateId;
import com.yt.app.frame.page.IPage;
import com.yt.app.frame.page.PageBean;
import com.yt.app.api.v1.entity.Dictionary;
import com.yt.app.api.v1.entity.Menu;
import com.yt.app.api.v1.entity.Role;
import com.yt.app.api.v1.entity.RoleMenu;
import com.yt.app.api.v1.entity.Sys;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Long> implements RoleService {
	@Autowired
	private RoleMapper mapper;
	@Autowired
	private RoleMenuMapper menumapper;
	@Autowired
	private MenuMapper mmapper;
	@Autowired
	private DictionaryMapper dictionarymapper;
	@Autowired
	private SysMapper sysMapper;
	@Autowired
	GenerateId idworker;

	@Override
	@Transactional
	public Integer deletebyid(long id) {

		Integer i = mapper.delete(id);
		RoleMenu rolemenu = new RoleMenu();
		rolemenu.setRole_id(id);
		menumapper.deleteObject(rolemenu);
		return i;
	}

	@Override
	@Transactional
	public Integer addobject(Role role) {

		// role.setId(IdWorker.getInstance().nextId());
		role.setIs_manage(DictionaryResource.ROLE_TYPE_21);
		Integer i = mapper.post(role);
		String[] menuCodes = role.getMenucode().split(",");
		RoleMenu rmenu = null;
		List<RoleMenu> listRoleMenu = new ArrayList<RoleMenu>();
		for (String mc : menuCodes) {
			rmenu = new RoleMenu();
			rmenu.setId(idworker.nextId());
			rmenu.setRole_id(role.getId());
			rmenu.setMenu_id(Long.valueOf(mc));
			// menumapper.post(rmenu);
			listRoleMenu.add(rmenu);
		}
		// 批量插入
		this.menumapper.insertRoleMenu(listRoleMenu);
		return i;
	}

	@Override
	public Map<String, Object> getid(long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		Role role = mapper.get(id);
		List<RoleMenu> listRoleMenu = menumapper.getroleid(role.getId());
		List<Menu> listMenu = mmapper.getlist();
		if (listRoleMenu.size() > 0) {
			for (Menu ml : listMenu) {
				for (RoleMenu rm : listRoleMenu) {
					if (ml.getId().longValue() == rm.getMenu_id().longValue()) {
						ml.setChecked(true);
						ml.setOpen(true);
					}
				}
			}
		}
		/**
		 * 关联添加父级树
		 * 
		 * @author huanghao
		 * 
		 */
		long[] getsysid = listMenu.stream().mapToLong(Menu::getSys_id).distinct().toArray();
		List<Sys> getlistsys = sysMapper.getByIds(getsysid);
		listMenu.stream().forEach(Menu -> {
			getlistsys.stream().forEach(Sys -> {
				if (Menu.getSys_id().longValue() == Sys.getId().longValue() && Menu.getLevel().equals(DictionaryResource.MENU_LEVEL)) {
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
			for (Menu m : listMenu) {
				if (m.getSys_id() != null && m.getChecked() != null) {
					if (sys.getId().longValue() == m.getSys_id().longValue()) {
						menu.setChecked(true);
						menu.setOpen(true);
					}
				}
 			}
			listMenu.add(menu);
		}
		map.put("listmeun", listMenu);
		map.put("role", role);
		return map;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IPage<Role> getlistAll(Map<String, Object> param) {

		int count = 0;
		if (PageBean.isPaging(param)) {
			count = mapper.countlist(param);
			if (count == 0) {
				return PageBean.EMPTY_PAGE;
			}
		}
		List<Role> loglist = mapper.list(param);
		long[] obj = loglist.stream().mapToLong(Role::getType).distinct().toArray();
		long[] objmanage = loglist.stream().mapToLong(Role::getIs_manage).distinct().toArray();
		List<Dictionary> listd = dictionarymapper.getByIds(obj);
		List<Dictionary> listd2 = dictionarymapper.getByIds(objmanage);

		loglist.stream().forEach(Role -> {
			listd.stream().forEach(Dictionary -> {
				if (Role.getType().equals(Dictionary.getCode().intValue())) {
					Role.setTypename(Dictionary.getName());
					return;
				}
			});
		});

		loglist.stream().forEach(Role -> {
			listd2.stream().forEach(Dictionary -> {
				if (Role.getIs_manage().equals(Dictionary.getCode().intValue())) {
					Role.setIs_managename(Dictionary.getName());
					return;
				}
			});
		});
		return new PageBean<Role>(param, loglist, count);

	}

	@Override
	@Transactional
	public Integer updateobject(Role role) {
		Integer i = mapper.put(role);
		String[] menuCodes = role.getMenucode().split(",");
		RoleMenu rmenu = null;
		int getnum = menumapper.deletebyroleid(role.getId());// 先把原先的数据删除
		List<RoleMenu> listRoleMenu = new ArrayList<RoleMenu>();
		if (getnum > 0) {
			for (String mc : menuCodes) {
				rmenu = new RoleMenu();
				rmenu.setId(idworker.nextId());
				rmenu.setRole_id(role.getId());
				rmenu.setMenu_id(Long.valueOf(mc));
				listRoleMenu.add(rmenu);
			}
		}
		// 批量插入
		this.menumapper.insertRoleMenu(listRoleMenu);
		return i;
	}

	@Override
	public List<Dictionary> getdicttype() {
		List<Dictionary> listdict = dictionarymapper.getBycode(DictionaryResource.ACCOUNT_TYPE_10);
		return listdict;
	}

}