package com.xinnet.core.utils;
/**
 * 
 *
 * 功能描述：常量类
 * 
 * @author 湛智
 *
 * 时间：2014年9月4日
 *
 */
public class ConstantSet {
	/**
	 * 登录验证--用户名不存在
	 */
	public static final String LOGIN_NOT_FOUND_USER = "LOGIN_NOT_FOUND_USER";
	/**
	 * 登录验证--密码错误
	 */
	public static final String LOGIN_PASSWORD_ERROR = "LOGIN_PASSWORD_ERROR";
	/**
	 * 登录验证--认证成功
	 */
	public static final String LOGIN_PASSWORD_SUCCESS = "LOGIN_PASSWORD_SUCCESS";
	/**
	 * 临时用户编号前缀
	 */
	public static final String TEMPUSERLABEL = "L";
	/**
	 * 真实用户编号前缀
	 */
	public static final String USERLABEL = "A";
	/**
	 * 购物车编号前缀
	 */
	public static final String CARTLABEL = "CART";
	/**
	 * 商品编号前缀
	 */
	public static final String GOODSLABEL = "GOODSLABEL";
	
	/**
	 * 服务器编码前缀
	 */
	public static final String SERVERLABEL = "SERVER";
	
	/**
	 * 服务器IP编码前缀
	 */
	public static final String SERVERIPLABEL = "SERVERIP";
	
	/**
	 * 订单编号前缀
	 */
	public static final String ORDERSLABEL = "ORDERS";
	/**
	 * 订单详情编号前缀
	 */
	public static final String ORDERSINFOLABEL = "ORDERSINFOLABEL";
	/**
	 * Cookie的生命周期
	 */
	public static final int COOKIEMAXAGE = 604800;
	/**
	 * 暂停
	 */
	public static final String RUNSTATE_PAUSE = "1";
	/**
	 * 运行
	 */
	public static final String RUNSTATE_START = "0";
	/**
	 * 待删
	 */
	public static final String RUNSTATE_WAIT_DELETE = "2";
	/**
	 * 空闲
	 */
	public static final String RUNSTATE_IDLE = "3";
	/**
	 * 保留
	 */
	public static final String RUNSTATE_RETAIN = "4";
	/**
	 * 批量修改参数是否为空--全部为空
	 */
	public static final int EMPTYCODE_ALLEMPTY = 0;
	/**
	 * 批量修改参数是否为空--别名不为空
	 */
	public static final int EMPTYCODE_ALIAS_NOTEMPTY = 1;
	/**
	 * 批量修改参数是否为空--空间大小不为空
	 */
	public static final int EMPTYCODE_SPACESIZE_NOTEMPTY = 2;
	/**
	 * 批量修改参数是否为空--机房名称不为空
	 */
	public static final int EMPTYCODE_ROOMNAME_NOTEMPTY = 3;
	/**
	 * 批量修改参数是否为空--运行状态不为空
	 */
	public static final int EMPTYCODE_RUNSTATE_NOTEMPTY = 4;
	/**
	 * 批量修改参数是否为空--服务器名不为空
	 */
	public static final int EMPTYCODE_SERVERNAME_NOTEMPTY = 5;
	/**
	 * 批量修改最大可修改条数
	 */
	public static final int UPDATE_BATCH_MAX_COUNT = 500;
	/**
	 * 字典项组：操作系统
	 */
	public static final String DICT_GROUP_OS = "OperatingSystem";
	/**
	 * 字典项组：机房
	 */
	public static final String DICT_GROUP_ROOM = "ServerRoom";
	/**
	 * 字典项组：所有者
	 */
	public static final String DICT_GROUP_OWNER = "Owner";
	/**
	 * 字典项组：普通ip使用状态
	 */
	public static final String DICT_GROUP_COMMON_IP_USE_STATE = "CommonIpUseState";
	/**
	 * 字典项组：ip分配状态
	 */
	public static final String DICT_GROUP_ASSIGN_STATE = "AssignState";
	
	/**
	 * 字典项组：独立ip使用状态
	 */
	public static final String DICT_GROUP_INDEPENDENT_IP_USE_STATE = "IndependentIpUseState";
	/**
	 * 主任务状态：未开始
	 */
	public static final String JOB_STATE_FAILSTOSTART = "0";
	/**
	 * 主任务状态：执行中
	 */
	public static final String JOB_STATE_RUNING = "1";
	/**
	 * 主任务状态：结束
	 */
	public static final String JOB_STATE_END = "2";
	/**
	 * 子任务状态：任务未开始
	 */
	public static final String CHILD_JOB_STATE_FAILSTOSTART = "0";
	/**
	 * 子任务状态：任务失败
	 */
	public static final String CHILD_JOB_STATE_FAIL = "1";
	/**
	 * 子任务状态：任务执行中
	 */
	public static final String CHILD_JOB_STATE_RUNING = "2";
	/**
	 * 子任务状态：任务成功
	 */
	public static final String CHILD_JOB_STATE_SUCCESS = "3";
	/**
	 * 文件大小限制(Byte)
	 */
	public static final long FILE_MAX_SIZE = 1048576L;
	/**
	 * 系统用户名
	 */
	public static final String USER_SYSTEM = "System";
	/**
	 * 运行状态校验  到期时间-15天与当前时间的比较校验
	 */
	public static final Integer RUNSTATE_DAY_CHECK = -15;
	/** 产品类型：虚拟主机*/
	public static final String PRODUCT_TYPE_VHOST = "VirtualHost";
	
	/** 产品类型：驰云主机*/
	public static final String PRODUCT_TYPE_EASYCLOUD = "EasyCloud";
	
	/** 产品类型：数据库*/
	public static final String PRODUCT_TYPE_DB = "DB";
	
	/** 产品类型：数据库-SQLServer*/
	public static final String PRODUCT_SERIES_CODE_SQLSERVER = "SQLServer";
	
	/** 产品类型：数据库-MySQL*/
	public static final String PRODUCT_SERIES_CODE_MYSQL = "MySQL";
	
	/** 此值代表数据库字段更新为NULL，SQL中做判断*/
	public static final String NULL = "null.null";
	/**
	 * 需要调用接口
	 */
	public static final Integer USE_INTERFACE = 1;
	/**
	 * 不需要调用接口
	 */
	public static final Integer NOT_USE_INTERFACE = 0;
}
