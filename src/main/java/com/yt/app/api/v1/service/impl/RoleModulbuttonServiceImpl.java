package com.yt.app.api.v1.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.app.api.v1.entity.Button;
import com.yt.app.api.v1.entity.Menu;
import com.yt.app.api.v1.entity.RoleModulbutton;
import com.yt.app.api.v1.mapper.ButtonMapper;
import com.yt.app.api.v1.mapper.MenuMapper;
import com.yt.app.api.v1.mapper.RoleModulbuttonMapper;
import com.yt.app.api.v1.service.RoleModulbuttonService;
import com.yt.app.common.base.impl.BaseServiceImpl;

/**
 * @author zj default
 * 
 * @version 1.1
 */

@Service
public class RoleModulbuttonServiceImpl extends BaseServiceImpl<RoleModulbutton, Long> implements RoleModulbuttonService {
	@Autowired
	private RoleModulbuttonMapper mapper;

	@Autowired
	private MenuMapper menumapper;

	@Autowired
	private ButtonMapper buttonMapper;

	@Override
	public List<Menu> getModulsByRoleId(String roleId) {
		List<Menu> listmodul = menumapper.list(null);
		List<Button> listButton = buttonMapper.list(null);
		List<Button> resultButton = new ArrayList<Button>();
		Map<String, Object> param = new HashMap<String, Object>();
		for (Menu m : listmodul) {
			if (m.getButtonIds() != null && !m.getButtonIds().equals("")) {
				String[] buttonIds = m.getButtonIds().split(",");
				param.put("array", buttonIds);
				param.put("role_id", roleId);
				param.put("modul_id", m.getId());
				List<Button> exitsListButton = mapper.getButtons(param);
				resultButton = new ArrayList<Button>();
				for (String id : buttonIds) {
					for (Button btn : listButton) {
						Button adbutton = new Button(btn.getId(), btn.getName(), btn.getStatus(), btn.getRemark());
						if (id.equals(btn.getId().toString())) {
							for (Button b : exitsListButton) {
								if (adbutton.getId().equals(b.getId())) {
									adbutton.setFlag(true);
									break;
								} else {
									adbutton.setFlag(false);
								}
							}
							resultButton.add(adbutton);
							break;
						}
					}
				}
				m.setButtons(resultButton);
			}
		}
		return listmodul;
	}

	@Override
	@Transactional
	public Integer adds(String roleid, RoleModulbutton[] rmbs) {
		Integer i = 1;
		mapper.deleteByRoleId(roleid);
		for (RoleModulbutton rmb : rmbs) {
			i = mapper.post(rmb);
		}
		return i;
	}
}