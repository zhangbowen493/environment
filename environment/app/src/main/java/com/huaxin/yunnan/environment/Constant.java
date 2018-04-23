package com.huaxin.yunnan.environment;

/**
 * 常量类
 * Created by zbw on 2017/10/15 10:39.
 */

public class Constant {
	//HANDLER发送定位1
	public static final int LOCATION_MSG = 80;
	/**
	 * 网络请求返回标识 - 成功
	 */
	public static final String RESPONSE_SUCCESS = "1";
	/**
	 * 网络请求返回标识 - Token失效
	 */
	public static final String RESPONSE_TOKEN_FAILED = "-104";

	/**
	 * 外网开发
	 */
	public static final String IP = "http://120.27.124.2";
	/**
	 * 生产环境
	 */
//	public static final String IP = "http://61.166.240.109";
	/**
	 * 晓锦IP(猎豹WIFI)
	 */
//	public static final String IP = "http://192.168.0.106";
//	public static final String IP = "http://192.168.0.88";
//	public static final String IP = "http://192.168.0.87";
	/**
	 * 晓锦IP(ui)
	 */
//	public static final String IP = "http://192.168.0.45";
	/**
	 * 季哥IP
	 */
//	public static final String IP = "http://192.168.0.165";
	/**
	 * 内网测试
	 */
//	public static final String IP = "http://192.168.43.208";
	/**
	 * 王维春IP
	 */
	//云南
//	public static final String IP = "http://192.168.1.103";
//	public static final String IP = "http://192.168.75.54";
//天津
//	public static final String IP = "http://192.168.43.45";
	/**
	 * 外网开发
	 */
	public static final String HTTPSURL = IP + ":9090/ynhjjc/hjjcMobile/";
//	public static final String HTTPSURL = IP + ":5032/ynhjjc/hjjcMobile/";
	/**
	 * 开发
	 */
//	public static final String HTTPSURL = IP + ":8080/ynhjjc/hjjcMobile/";

	/**
	 * 登陆
	 */
	public static final String URL_LOGIN = HTTPSURL + "logon/logon.act";
	/**
	 * 修改密码
	 */
	public static final String URL_UPDATEPWD = HTTPSURL + "updataPassword/updata.act";
	/**
	 * 任务列表接口
	 */
	public static final String URL_QUERY_TASK_LIST = HTTPSURL + "MobileA001004/queryTaskList.act";
	/**
	 * 任务详情接口
	 */
	public static final String URL_QUERY_TASK_IFOF = HTTPSURL + "MobileA001004/queryTaskInfo.act";

	//********************审核接口*********************
	/**
	 * 获取待办列表
	 */
	public static final String URL_AUDIT_GETTODOLIST = HTTPSURL + "audit/getToDoList.act";
	/**
	 * 获取待办详情
	 */
	public static final String URL_PEND_AUDIT = HTTPSURL + "E002002/detail.act";
	/**
	 * 获取下一个节点列表(审核时)
	 */
	public static final String URL_AUDIT_GETNEXTACTLIST = HTTPSURL + "audit/getNextActListforAudit.act";
	/**
	 * 获取活动节点审核员列表
	 */
	public static final String URL_AUDIT_GETUSERLISTOFACT = HTTPSURL + "audit/getUserListOfAct.act";
	/**
	 * 单据审核通过
	 */
	public static final String URL_AUDIT_DOPASSOFMOBILE = HTTPSURL + "audit/doPassOfMobile.act";
	/**
	 * 单据审核驳回
	 */
	public static final String URL_AUDIT_DOREJECTOFMOBILE = HTTPSURL + "audit/doRejectOfMobile.act";
	/**
	 * 获取业务关联流程列表
	 */
	public static final String URL_AUDIT_GETPROCESSLIST = HTTPSURL + "audit/getProcessList.act";
	/**
	 * 获取下一个节点列表(提交时)
	 */
	public static final String URL_AUDIT_GETNEXTACTLISTFORSUBMIT = HTTPSURL + "audit/getNextActListforSubmit.act";
	/**
	 * 单据提交
	 */
	public static final String URL_AUDIT_DOSUBMIT = HTTPSURL + "audit/doSubmitOfMobile.act";
	/**
	 * 获取审核历史
	 */
	public static final String URL_AUDIT_GETAUDITHISTORYLIST = HTTPSURL + "audit/getAuditHistoryList.act";
	/**
	 * 获取已办接口
	 */
	public static final String URL_AUDIT_GETTOHASDOLIST = HTTPSURL + "audit/getToHasDoList.act";
	//********************任务模板接口*********************
	/**
	 * 城镇污水处理厂现场监察记录
	 */
	public static final String URL_QUERY_CR_INFO_LIST = HTTPSURL + "A001004001/list.act";
	public static final String URL_QUERY_CR_INFO = HTTPSURL + "A001004001/detail.act";
	/**
	 * 畜牧养殖现场监察记录
	 */
	public static final String URL_QUERY_CRD_INFO_LIST = HTTPSURL + "A001004002/list.act";
	public static final String URL_QUERY_CRD_INFO = HTTPSURL + "A001004002/detail.act";
	/**
	 * 钢铁行业现场监察记录
	 */
	public static final String URL_QUERY_GR_INFO_LIST = HTTPSURL + "A001004003/list.act";
	public static final String URL_QUERY_GR_INFO = HTTPSURL + "A001004003/detail.act";
	/**
	 * 合成氨行业现场监察记录
	 */
	public static final String URL_QUERY_HRD_INFO_LIST = HTTPSURL + "A001004004/list.act";
	public static final String URL_QUERY_HRD_INFO = HTTPSURL + "A001004004/detail.act";
	/**
	 * 火电企业现场监察记录
	 */
	public static final String URL_QUERY_HR_INFO_LIST = HTTPSURL + "A001004005/list.act";
	public static final String URL_QUERY_HR_INFO = HTTPSURL + "A001004005/detail.act";
	/**
	 * 焦化行业现场监察记录
	 */
	public static final String URL_QUERY_JRD_INFO_LIST = HTTPSURL + "A001004006/list.act";
	public static final String URL_QUERY_JRD_INFO = HTTPSURL + "A001004006/detail.act";
	/**
	 * 金属选矿行业现场监察
	 */
	public static final String URL_QUERY_JR_INFO_LIST = HTTPSURL + "A001004007/list.act";
	public static final String URL_QUERY_JR_INFO = HTTPSURL + "A001004007/detail.act";
	/**
	 * 排污费征收稽查现场记录
	 */
	public static final String URL_QUERY_PR_INFO_LIST = HTTPSURL + "A001004008/list.act";
	public static final String URL_QUERY_PR_INFO = HTTPSURL + "A001004008/detail.act";
	/**
	 * 云南省铅治行业现场监察记录接口
	 */
	public static final String URL_QUERY_QC_INFO_LIST = HTTPSURL + "A001004009/list.act";
	public static final String URL_QUERY_QC_INFO = HTTPSURL + "A001004009/detail.act";
	/**
	 * 生态环境现场监察记录
	 */
	public static final String URL_QUERY_SR_INFO_LIST = HTTPSURL + "A001004010/list.act";
	public static final String URL_QUERY_SR_INFO = HTTPSURL + "A001004010/detail.act";
	/**
	 * 云南省水电行业现场监察记录接口
	 */
	public static final String URL_QUERY_HC_INFO_LIST = HTTPSURL + "A001004011/list.act";
	public static final String URL_QUERY_HC_INFO = HTTPSURL + "A001004011/detail.act";
	/**
	 * 水泥行业环境监察记录
	 */
	public static final String URL_QUERY_CC_INFO_LIST = HTTPSURL + "A001004012/list.act";
	public static final String URL_QUERY_CC_INFO = HTTPSURL + "A001004012/detail.act";
	/**
	 * 总队现场检查(勘察)笔录接口
	 */
	public static final String URL_QUERY_ZDXCJCJL_INFO_LIST = HTTPSURL + "A001004013/list.act";
	public static final String URL_QUERY_ZDXCJCJL_INFO = HTTPSURL + "A001004013/detail.act";
	public static final String URL_RECORD = HTTPSURL + "/A001004013/update.act";
	/**
	 * 铜冶炼行业现场监察记录
	 */
	public static final String URL_QUERY_TR_INFO_LIST = HTTPSURL + "A001004014/list.act";
	public static final String URL_QUERY_TR_INFO = HTTPSURL + "A001004014/detail.act";
	/**
	 * 污染源自动在线模板
	 */
	public static final String URL_QUERY_AC_INFO_LIST = HTTPSURL + "A001004015/list.act";
	public static final String URL_QUERY_AC_INFO = HTTPSURL + "A001004015/detail.act";
	/**
	 * 无机磷化工行业现场监察记录
	 */
	public static final String URL_QUERY_WR_INFO_LIST = HTTPSURL + "A001004016/list.act";
	public static final String URL_QUERY_WR_INFO = HTTPSURL + "A001004016/detail.act";
	/**
	 * 锡选治行业现场监察记录
	 */
	public static final String URL_QUERY_XC_INFO_LIST = HTTPSURL + "A001004017/list.act";
	public static final String URL_QUERY_XC_INFO = HTTPSURL + "A001004017/detail.act";
	/**
	 * 云南省造纸行业现场监察记录接口
	 */
	public static final String URL_QUERY_PC_INFO_LIST = HTTPSURL + "A001004018/list.act";
	public static final String URL_QUERY_PC_INFO = HTTPSURL + "A001004018/detail.act";
	/**
	 * 取证材料
	 */
	public static final String URL_QUERY_FM_INFO_LIST = HTTPSURL + "A001004019/list.act";
	public static final String URL_QUERY_FM_INFO = HTTPSURL + "A001004019/detail.act";
	/**
	 * 污染源调查询问笔录
	 */
	public static final String URL_QUERY_WRD_INFO_LIST = HTTPSURL + "A001004020/list.act";
	public static final String URL_QUERY_WRD_INFO = HTTPSURL + "A001004020/detail.act";
	public static final String URL_PollutionSurveryTakeDown = HTTPSURL + "/A001004020/update.act";
	//********************污染源信息接口*********************
//	/**
//	 * 污染源信息列表
//	 */
//	public static final String URL_QUERY_POLLUTION_INFO = HTTPSURL + "G001001/query_pollutions.act";
	/**
	 * 查询污染源企业列表
	 */
	public static final String URL_QUERY_POLLUTION_INFO = HTTPSURL + "G001001/query_pollution.act";
	/**
	 * 查询企业变更信息
	 */
	public static final String URL_QUERY_POLLUTIONCHANGE_INFO = HTTPSURL + "G001001/query_pollution_cinfo.act";
	/**
	 * 查询企业档案信息:
	 */
	public static final String URL_QUERY_FILEINFO_INFO = HTTPSURL + "G001001/query_pollution_osinfo.act";
	/**
	 * 查询企业废气排放口信息:
	 */
	public static final String URL_QUERY_FLUEGAS_INFO = HTTPSURL + "G001001/query_pollution_einfo.act";
	/**
	 * 查询企业废气排放口排放污染物信息:
	 */
	public static final String URL_QUERY_WASTEGASPOLLUTION_INFO = HTTPSURL + "G001001/query_pollution_epinfo.act";
	/**
	 * 查询企业废气治理设施信息:
	 */
	public static final String URL_QUERY_FLUEGASMANAGEMENT_INFO = HTTPSURL + "G001001/query_pollution_tfinfo.act";
	/**
	 * 查询企业废水排放口信息:
	 */
	public static final String URL_QUERY_WASTEWATEROUTFALL_INFO = HTTPSURL + "G001001/query_pollution_dpinfo.act";
	/**
	 * 查询企业废水排放口排放污染物信息:
	 */
	public static final String URL_QUERY_WASTEWATERPOLLUTION_INFO = HTTPSURL + "G001001/query_pollution_wpinfo.act";
	/**
	 * 查询企业废水治理设施信息:
	 */
	public static final String URL_QUERY_WASTEWATERTREATMENT_INFO = HTTPSURL + "G001001/query_pollution_wtinfo.act";
	/**
	 * 查询企业产生固体废物信息:
	 */
	public static final String URL_QUERY_SOLIDWASTE_INFO = HTTPSURL + "G001001/query_pollution_psinfo.act";
	/**
	 * 查询企业管理属性信息:
	 */
	public static final String URL_QUERY_ATTRIBUTEMANAGEMENT_INFO = HTTPSURL + "G001001/query_pollution_minfo.act";
	/**
	 * 查询企业环境属性信息:
	 */
	public static final String URL_QUERY_ENVIRONMENTATTRIBUTE_INFO = HTTPSURL + "G001001/query_pollution_etinfo.act";
	/**
	 * 查询企业生产设备信息:
	 */
	public static final String URL_QUERY_PRODUCTEQUIP_INFO = HTTPSURL + "G001001/query_pollution_peinfo.act";
	/**
	 * 查询企业基本信息:
	 */
	public static final String URL_QUERY_ESSENTIALINFORMATION_INFO = HTTPSURL + "G001001/query_pollution_info.act";
	/**
	 * 查询企业主要原辅材料信息:
	 */
	public static final String URL_QUERY_POLLYTIONMATERIALS_INFO = HTTPSURL + "G001001/query_pollution_msinfo.act";
	/**
	 * 查询企业噪声源测点信息:
	 */
	public static final String URL_QUERY_NOSICESOURCE_INFO = HTTPSURL + "G001001/query_pollution_sninfo.act";
	/**
	 * 企业噪声源信息:
	 */
	public static final String URL_QUERY_NOISESOURCE_INFO = HTTPSURL + "G001001/query_pollution_ninfo.act";
	/**
	 * 查询企业主要产品信息:
	 */
	public static final String URL_QUERY_MAJORPRODUCT_INFO = HTTPSURL + "G001001/query_pollution_mpinfo.act";
	/**
	 * 查询通讯录列表信息:
	 */
	public static final String URL_QUERY_MAILLIST_INFO = HTTPSURL + "Ebook/ebook.act";
	/**
	 * 查询部门人员列表信息:
	 */
	public static final String URL_QUERY_DEPARTER_INFO = HTTPSURL + "Ebook/ebookList.act";
	/**
	 * 取证材料附件上传:
	 */
	public static final String URL_UP_FILE_INFO = HTTPSURL + "androidfile/android_upload_file.act";
	/**
	 * 取证材料附件下载:
	 */
	public static final String URL_DOWN_FILE_INFO = HTTPSURL + "file/android_download_file.act";
	/**
	 * 取证材料附件下载:
	 */
	public static final String URL_DELETE_FILE_INFO = HTTPSURL + "file/android_delete_file.act";
	/**
	 * 驳回重提交:
	 */
	public static final String URL_BOHUI_CHONGTIJIAO_INFO = HTTPSURL + "E002002/save.act";
	/**
	 * 驳回重提交:
	 */
	public static final String URL_BOHUI_WENJIAN_INFO = HTTPSURL + "E002002/e002_android_upload_file.act";
	/**
	 * 消息列表:
	 */
	public static final String URL_MESSAGE_LOG_INFO = HTTPSURL + "messageLogging/list.act";
	/**
	 * 是否已读:
	 */
	public static final String URL_MESSAGE_READ_INFO = HTTPSURL + "messageLoggingRecycle/list.act";
	/**
	 * 推送通知:
	 */
	public static final String URL_PUSH = HTTPSURL + "messageLogging/instatMessaging.act";
	/**
	 * 上送定位数据:
	 */
	public static final String URL_UP_LOCATION = HTTPSURL + "positionrepor/save_posinfo.act";

}
