package com.yt.app.common.resource;

import java.io.Serializable;

/**
 * 
 * 字典
 * 
 * @author zj
 * 
 *
 */
public class DictionaryResource implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * 默认状态 21 是 ‘是’ 22 是 ‘否’
	 */
	public static final Long STATUS_20 = 20L;

	public static final Long STATUS_21 = 21L;

	public static final Long STATUS_22 = 22L;

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
	public static final Integer REGION_GRADE_1 = 1;
	public static final Integer REGION_GRADE_2 = 2;
	public static final Integer REGION_GRADE_3 = 3;
	public static final Integer REGION_GRADE_4 = 4;
	public static final Integer REGION_GRADE_5 = 5;

	// 员工类型
	/**
	 * 31
	 */
	public static final Long ACCOUNT_TYPE_10 = 10L;
	/**
	 * 教师
	 */
	public static final Long ACCOUNT_TYPE_11 = 11L;
	/**
	 * 经理
	 */
	public static final Long ACCOUNT_TYPE_12 = 12L;
	/**
	 * 董事
	 */
	public static final Long ACCOUNT_TYPE_13 = 13L;
	/**
	 * 内置超级管理员
	 */
	public static final Long ACCOUNT_TYPE_18 = 18L;

	// 系统等级
	/**
	 * 31
	 */
	public static final Integer SYS_LEVEL_31 = 31;
	/**
	 * 31
	 */
	public static final String SYS_LEVEL_11 = "一级";
	/**
	 * 32
	 */
	public static final Integer SYS_LEVEL_32 = 32;
	/**
	 * 32
	 */
	public static final String SYS_LEVEL_22 = "二级";

	// 跟进状态
	/*
	 * 新户
	 */
	public static final Long PATRIARCH_FLLOWSTATUS_571 = 571L;
	/*
	 * 沟通
	 */
	public static final Long PATRIARCH_FLLOWSTATUS_572 = 572L;
	/*
	 * 未接通
	 */
	public static final Long PATRIARCH_FLLOWSTATUS_573 = 573L;
	/*
	 * 诺访
	 */
	public static final Long PATRIARCH_FLLOWSTATUS_574 = 574L;
	/*
	 * 到访
	 */
	public static final Long PATRIARCH_FLLOWSTATUS_575 = 575L;
	/*
	 * 未转化
	 */
	public static final Long PATRIARCH_FLLOWSTATUS_576 = 576L;
	/*
	 * 已转化
	 */
	public static final Long PATRIARCH_FLLOWSTATUS_577 = 577L;

	// 等级
	/*
	 * 默认
	 */
	public static final Long PATRIARCH_LEVEL_1951 = 1951L;
	/*
	 * 1
	 */
	public static final Long PATRIARCH_LEVEL_1952 = 1952L;
	/*
	 * 2
	 */
	public static final Long PATRIARCH_LEVEL_1953 = 1953L;
	/*
	 * 3
	 */
	public static final Long PATRIARCH_LEVEL_1954 = 1954L;
	/*
	 * 4
	 */
	public static final Long PATRIARCH_LEVEL_1955 = 1955L;

	// 状态
	/*
	 * 正常
	 */
	public static final Long STATUS_1841 = 1841L;
	/*
	 * 停用
	 */
	public static final Long STATUS_1842 = 1842L;

	// 客户状态
	/**
	 * 未确认的客户信息
	 */
	public static final Long PATRIARCH_STATUS_1971 = 1971L;
	/**
	 * 确认客户信息
	 */
	public static final Long PATRIARCH_STATUS_1972 = 1972L;
	/**
	 * 无效用户
	 */
	public static final Long PATRIARCH_STATUS_1973 = 1973L;
	/**
	 * 正式学员
	 */
	public static final Long PATRIARCH_STATUS_1974 = 1974L;

	/**
	 * 跟进
	 */
	public static final Long PATRIARCH_STATUS_1975 = 1975L;

	/**
	 * 试听
	 */
	public static final Long PATRIARCH_STATUS_1976 = 1976L;

	/**
	 * 冻结
	 */
	public static final Long PATRIARCH_STATUS_1977 = 1977L;

	/**
	 * 删除
	 */
	public static final Long PATRIARCH_STATUS_1978 = 1978L;

	// vip客户
	/**
	 * 普通客户
	 */
	public static final Long PATRIARCH_VIP_1993 = 1993L;

	/**
	 * 关系客户
	 */
	public static final Long PATRIARCH_VIP_1992 = 1992L;

	/**
	 * 大单客户
	 */
	public static final Long PATRIARCH_VIP_1991 = 1991L;

	// 客户来源
	/**
	 * 市场活动
	 */
	public static final Long PATRIARCH_SOURCE_561 = 561L;

	/**
	 * 电话咨询
	 */
	public static final Long PATRIARCH_SOURCE_562 = 562L;

	/**
	 * 转介绍
	 */
	public static final Long PATRIARCH_SOURCE_563 = 563L;

	// 缴费类型
	/**
	 * 新签(定金)
	 */
	public static final Long ACCOUNTCHARGEAPPLIES_CHARGETYPE_2141 = 2141L;

	/**
	 * 新签回款
	 */
	public static final Long ACCOUNTCHARGEAPPLIES_CHARGETYPE_2142 = 2142L;

	/**
	 * 前期结课续费
	 */
	public static final Long ACCOUNTCHARGEAPPLIES_CHARGETYPE_2143 = 2143L;

	/**
	 * 前期非结课续费
	 */
	public static final Long ACCOUNTCHARGEAPPLIES_CHARGETYPE_2144 = 2144L;

	/**
	 * 后期结课续费
	 */
	public static final Long ACCOUNTCHARGEAPPLIES_CHARGETYPE_2145 = 2145L;

	/**
	 * 后期非结课续费
	 */
	public static final Long ACCOUNTCHARGEAPPLIES_CHARGETYPE_2146 = 2146L;

	// 支付状态
	/**
	 * 已支付
	 */
	public static final Long ACCOUNTCHARGEAPPLIES_PAYSTATUS_2151 = 2151L;

	/**
	 * 未支付
	 */
	public static final Long ACCOUNTCHARGEAPPLIES_PAYSTATUS_2152 = 2152L;
}
