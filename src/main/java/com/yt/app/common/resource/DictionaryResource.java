package com.yt.app.common.resource;

import java.io.Serializable;

/**
 * 
 * 字典
 * 
 * @author zj
 * 
 *         默认规定：0代表‘是’，1代表‘否’
 *
 */
public class DictionaryResource implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * 默认状态 21 是 ‘是’ 22 是 ‘否’
	 */
	public static final Long STATUS_21 = 21L;

	public static final Long STATUS_22 = 22L;

	/**
	 * 
	 */
	// ///////////////////////////////////////////////////////////////////用户////////////////////////////////////////////////////////////////////
	/**
	 * 用户删除状态 删除
	 */
	public static final Integer USER_STATUS_0 = 0;
	/**
	 * 用户删除状态 未删除
	 */
	public static final Integer USER_STATUS_1 = 1;
	/**
	 * 密钥未过期 是
	 */
	public static final Integer USER_CREDENTIALSEXPIRED_0 = 0;
	/**
	 * 用户未过期 是
	 */
	public static final Integer USER_EXPIRED_0 = 0;
	/**
	 * 用户未锁定 是
	 */
	public static final Integer USER_LOCKED_0 = 0;

	/**
	 * 菜单父级设置值
	 */
	public static final String MENU_PID = "-1";
	/**
	 * 数据菜单等级
	 */
	public static final Integer MENU_LEVEL = 31;

	// ///////////////////////////////////////////////////////////////////XX////////////////////////////////////////////////////////////////////
	/**
	 * 菜单等级
	 */
	public static final Integer MENU_LEVLE_1 = 31;
	public static final Integer MENU_LEVLE_2 = 32;
	public static final Integer MENU_LEVLE_3 = 33;
	public static final Integer MENU_LEVLE_4 = 34;
	public static final Integer MENU_LEVLE_5 = 35;

	/**
	 * 省市县等级 1、国籍 2、省 3、市 4、县区 5、街道
	 */
	public static final Integer REGION_GRADE_1 = 1; // 国籍
	public static final Integer REGION_GRADE_2 = 2; // 省
	public static final Integer REGION_GRADE_3 = 3; // 市
	public static final Integer REGION_GRADE_4 = 4; // 县
	public static final Integer REGION_GRADE_5 = 5; // 街道
	/**
	 * 账户类型
	 */
	public static final Long ACCOUNT_TYPE_10 = 10L; // 类型系统
	public static final Long ACCOUNT_TYPE_1 = 11L; // 商城系统
	public static final Long ACCOUNT_TYPE_2 = 12L; // 论坛系统
	public static final Long ACCOUNT_TYPE_3 = 13L; // 物业系统

	/**
	 * 系统等级
	 */
	public static final Integer SYS_LEVEL_31 = 31;
	public static final String SYS_LEVEL_11 = "一级";
	public static final Integer SYS_LEVEL_32 = 32;
	public static final String SYS_LEVEL_22 = "二级";

	/**
	 * 默认管理员
	 */
	public static final Integer ROLE_TYPE_21 = 21;

	/**
	 * 学习情况
	 */
	public static final Long PAYHOUR_STATUS_751 = 751L;// 学习中
	public static final Long PAYHOUR_STATUS_752 = 752L;// 已学完

	/**
	 * 课时状态
	 */
	public static final Long HOUR_STATUS_771 = 771L;// 已上
	public static final Long HOUR_STATUS_772 = 772L;// 未上

	/**
	 * 操作课时数量
	 */
	public static final Integer HOURHISTORY_COUNT_1 = 1;// 数量1
	public static final Integer HOURHISTORY_COUNT_2 = 2;// 数量2

	/**
	 * 操作课时记录类型
	 */
	public static final Long HOURHISTORY_TYPE_811 = 811L;// 加课时
	public static final Long HOURHISTORY_TYPE_812 = 812L;// 减课时

	/**
	 * 学员状态
	 */
	// 新户
	public static final Long PATRIARCH_STATUS_571 = 571L;
	// 沟通
	public static final Long PATRIARCH_STATUS_572 = 572L;
	// 未接通
	public static final Long PATRIARCH_STATUS_573 = 573L;
	// 诺访
	public static final Long PATRIARCH_STATUS_574 = 574L;
	// 到访
	public static final Long PATRIARCH_STATUS_575 = 575L;
	// 未转化
	public static final Long PATRIARCH_STATUS_576 = 576L;
	// 已转化
	public static final Long PATRIARCH_STATUS_577 = 577L;

	/**
	 * 组织机构状态
	 */
	// 正常
	public static final Long ORGANIZATIONS_STATUS_571 = 1841L;
	// 停用
	public static final Long ORGANIZATIONS_STATUS_572 = 1842L;
}
