package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author huanghao
 * 
 * @version v1
 * @createdate 2016-10-14 10:16:02
 */
@Getter
@Setter
public class Sys implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Long parent_id;
	String name;
	String url;
	String linkUrl;
	String icon;
	String remark;
	String createtime;
	String modifytime;
	Long level;
	Integer version;
	List<Sys> child;// 用于存放对应的二级系统或菜单
	List<Menu> menus;// 存放对应的菜单（正常情况下只有二级系统才会拥有值）
	String levelname;

	public Sys() {
	}

	public Sys(Long id, Long parent_id, String name, String url, String linkUrl, String icon, String remark, String createtime, Long level,
			String modifytime, Integer version) {
		this.id = id;
		this.parent_id = parent_id;
		this.name = name;
		this.url = url;
		this.linkUrl = linkUrl;
		this.icon = icon;
		this.remark = remark;
		this.createtime = createtime;
		this.modifytime = modifytime;
		this.level = level;
		this.version = version;
	}
}