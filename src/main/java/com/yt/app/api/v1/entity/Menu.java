package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2016-10-17 13:55:30
 */
@Getter
@Setter
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	String name;
	String parent_id;
	Integer level;
	String url;
	String icon;
	Long sys_id;
	Integer order_no;
	Integer sortno;
	Integer is_show;
	Integer version;
	List<Menu> child;// 用于存放菜单对应的子菜单
	@JsonProperty("pId")
	String pId;
	Boolean checked;
	Boolean open;

	String links_id;// 以逗号分隔的字符串用来插入菜单关联的链接
	List<Link> links;// 存放对应关联链接
	String sys_name;// 系统名称
	String level_name;// 用于列表便捷显示等级

	public Menu() {
	}

	public Menu(Long id, String name, String parent_id, Integer level, String url, String icon, Long sys_id, Integer order_no, Integer sortno,
			Integer is_show, Integer version) {
		this.id = id;
		this.name = name;
		this.parent_id = parent_id;
		this.level = level;
		this.url = url;
		this.icon = icon;
		this.sys_id = sys_id;
		this.order_no = order_no;
		this.sortno = sortno;
		this.is_show = is_show;
		this.version = version;
	}
}