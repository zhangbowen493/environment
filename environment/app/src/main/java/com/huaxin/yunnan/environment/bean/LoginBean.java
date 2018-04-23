package com.huaxin.yunnan.environment.bean;

import java.io.Serializable;

import java.util.List;

/**
 * 登录bean
 * Created by zbw on 2017/10/19 10:36.
 */

public class LoginBean implements Serializable {
	/**
	 * birthday : 2013-11-14 12:00:00.0
	 * employer_id : 120123
	 * zip_code : 116026
	 * name_pinyin : null
	 * password :
	 * memos : 备注信息备注信息
	 * card_id : 427656789876552431
	 * order_no : 1
	 * third_id : null
	 * id : admin
	 * bank_id : boc
	 * faxno : 6354672
	 * userToken : eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhZG1pbiIsInN1YiI6IiIsImlhdCI6MTUwODQwNDI4OSwiZXhwIjoxNTA5MDA5MDg5fQ.Y_Ke5c8yHNO8QhspxAPVEX1s_loBcln0CIJZ6p098M4
	 * homeno : 9876514
	 * employed_date : 2013-10-03 12:00:00.0
	 * name : 超级管理员
	 * gender : 1
	 * bank_province : 210000
	 * userinfo_title : null
	 * del_status : null
	 * bank_account : 2132132132133
	 * office : A09201
	 * vc_sshy : null
	 * status : 0
	 * orgInfo : {"ve_date":null,"status":"0","corp_id":"402848bd4830fed70148312e0efb0631","zipcode":null,"vs_date":null,"unit_id":"1","code":"0000000","type":null,"name_pinyin":"环境监察总队","memos":null,"ou_nature":null,"order_no":"1","ou_category":"1","third_id":null,"id":"402848bd4830fed70148312e0efb0631","ou_type":null,"ou_address":null,"email":null,"address":null,"name":"云南省环境监察总队","telephone":null,"corp_name":"云南省环境监察总队","ou_rank":"0","tmp_ou":"0","parent_id":"-1"}
	 * bank_city : 211400
	 * is_default : 1
	 * vc_commper_book : null
	 * email : null
	 * address : 天津市滨海
	 * login_name : admin
	 * userIdentityList : [{"org_name":"云南省环境监察总队","org_id":"402848bd4830fed70148312e0efb0631","org_full_name":"云南省环境监察总队","corp_id":"402848bd4830fed70148312e0efb0631","corp_shortname":"环境监察总队","org_code":"0000000","corp_code":"0000000","ouinfo_category":"1","org_shortname":"环境监察总队","corp_name":"云南省环境监察总队"}]
	 * ouinfo_id : 402848bd4830fed70148312e0efb0631
	 * jobtitle_id : 13
	 * telephone : 15190807654
	 * joblevel_id : 10
	 * mobile : 13944232
	 * work_date : 2013-11-21 12:00:00.0
	 */

	private String birthday;
	private String employer_id;
	private String zip_code;
	private Object name_pinyin;
	private String password;
	private String memos;
	private String card_id;
	private String order_no;
	private Object third_id;
	private String id;
	private String bank_id;
	private String faxno;
	private String userToken;
	private String homeno;
	private String employed_date;
	private String name;
	private String gender;
	private String bank_province;
	private Object userinfo_title;
	private Object del_status;
	private String bank_account;
	private String office;
	private Object vc_sshy;
	private String status;
	private OrgInfoBean orgInfo;
	private String bank_city;
	private String is_default;
	private Object vc_commper_book;
	private Object email;
	private String address;
	private String login_name;
	private String ouinfo_id;
	private String jobtitle_id;
	private String telephone;
	private String joblevel_id;
	private String mobile;
	private String work_date;
	private List<UserIdentityListBean> userIdentityList;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmployer_id() {
		return employer_id;
	}

	public void setEmployer_id(String employer_id) {
		this.employer_id = employer_id;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public Object getName_pinyin() {
		return name_pinyin;
	}

	public void setName_pinyin(Object name_pinyin) {
		this.name_pinyin = name_pinyin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemos() {
		return memos;
	}

	public void setMemos(String memos) {
		this.memos = memos;
	}

	public String getCard_id() {
		return card_id;
	}

	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public Object getThird_id() {
		return third_id;
	}

	public void setThird_id(Object third_id) {
		this.third_id = third_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBank_id() {
		return bank_id;
	}

	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}

	public String getFaxno() {
		return faxno;
	}

	public void setFaxno(String faxno) {
		this.faxno = faxno;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getHomeno() {
		return homeno;
	}

	public void setHomeno(String homeno) {
		this.homeno = homeno;
	}

	public String getEmployed_date() {
		return employed_date;
	}

	public void setEmployed_date(String employed_date) {
		this.employed_date = employed_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBank_province() {
		return bank_province;
	}

	public void setBank_province(String bank_province) {
		this.bank_province = bank_province;
	}

	public Object getUserinfo_title() {
		return userinfo_title;
	}

	public void setUserinfo_title(Object userinfo_title) {
		this.userinfo_title = userinfo_title;
	}

	public Object getDel_status() {
		return del_status;
	}

	public void setDel_status(Object del_status) {
		this.del_status = del_status;
	}

	public String getBank_account() {
		return bank_account;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Object getVc_sshy() {
		return vc_sshy;
	}

	public void setVc_sshy(Object vc_sshy) {
		this.vc_sshy = vc_sshy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public OrgInfoBean getOrgInfo() {
		return orgInfo;
	}

	public void setOrgInfo(OrgInfoBean orgInfo) {
		this.orgInfo = orgInfo;
	}

	public String getBank_city() {
		return bank_city;
	}

	public void setBank_city(String bank_city) {
		this.bank_city = bank_city;
	}

	public String getIs_default() {
		return is_default;
	}

	public void setIs_default(String is_default) {
		this.is_default = is_default;
	}

	public Object getVc_commper_book() {
		return vc_commper_book;
	}

	public void setVc_commper_book(Object vc_commper_book) {
		this.vc_commper_book = vc_commper_book;
	}

	public Object getEmail() {
		return email;
	}

	public void setEmail(Object email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getOuinfo_id() {
		return ouinfo_id;
	}

	public void setOuinfo_id(String ouinfo_id) {
		this.ouinfo_id = ouinfo_id;
	}

	public String getJobtitle_id() {
		return jobtitle_id;
	}

	public void setJobtitle_id(String jobtitle_id) {
		this.jobtitle_id = jobtitle_id;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getJoblevel_id() {
		return joblevel_id;
	}

	public void setJoblevel_id(String joblevel_id) {
		this.joblevel_id = joblevel_id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWork_date() {
		return work_date;
	}

	public void setWork_date(String work_date) {
		this.work_date = work_date;
	}

	public List<UserIdentityListBean> getUserIdentityList() {
		return userIdentityList;
	}

	public void setUserIdentityList(List<UserIdentityListBean> userIdentityList) {
		this.userIdentityList = userIdentityList;
	}

	public static class OrgInfoBean {
		/**
		 * ve_date : null
		 * status : 0
		 * corp_id : 402848bd4830fed70148312e0efb0631
		 * zipcode : null
		 * vs_date : null
		 * unit_id : 1
		 * code : 0000000
		 * type : null
		 * name_pinyin : 环境监察总队
		 * memos : null
		 * ou_nature : null
		 * order_no : 1
		 * ou_category : 1
		 * third_id : null
		 * id : 402848bd4830fed70148312e0efb0631
		 * ou_type : null
		 * ou_address : null
		 * email : null
		 * address : null
		 * name : 云南省环境监察总队
		 * telephone : null
		 * corp_name : 云南省环境监察总队
		 * ou_rank : 0
		 * tmp_ou : 0
		 * parent_id : -1
		 */

		private Object ve_date;
		private String status;
		private String corp_id;
		private Object zipcode;
		private Object vs_date;
		private String unit_id;
		private String code;
		private Object type;
		private String name_pinyin;
		private Object memos;
		private Object ou_nature;
		private String order_no;
		private String ou_category;
		private Object third_id;
		private String id;
		private Object ou_type;
		private Object ou_address;
		private Object email;
		private Object address;
		private String name;
		private Object telephone;
		private String corp_name;
		private String ou_rank;
		private String tmp_ou;
		private String parent_id;

		public Object getVe_date() {
			return ve_date;
		}

		public void setVe_date(Object ve_date) {
			this.ve_date = ve_date;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCorp_id() {
			return corp_id;
		}

		public void setCorp_id(String corp_id) {
			this.corp_id = corp_id;
		}

		public Object getZipcode() {
			return zipcode;
		}

		public void setZipcode(Object zipcode) {
			this.zipcode = zipcode;
		}

		public Object getVs_date() {
			return vs_date;
		}

		public void setVs_date(Object vs_date) {
			this.vs_date = vs_date;
		}

		public String getUnit_id() {
			return unit_id;
		}

		public void setUnit_id(String unit_id) {
			this.unit_id = unit_id;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Object getType() {
			return type;
		}

		public void setType(Object type) {
			this.type = type;
		}

		public String getName_pinyin() {
			return name_pinyin;
		}

		public void setName_pinyin(String name_pinyin) {
			this.name_pinyin = name_pinyin;
		}

		public Object getMemos() {
			return memos;
		}

		public void setMemos(Object memos) {
			this.memos = memos;
		}

		public Object getOu_nature() {
			return ou_nature;
		}

		public void setOu_nature(Object ou_nature) {
			this.ou_nature = ou_nature;
		}

		public String getOrder_no() {
			return order_no;
		}

		public void setOrder_no(String order_no) {
			this.order_no = order_no;
		}

		public String getOu_category() {
			return ou_category;
		}

		public void setOu_category(String ou_category) {
			this.ou_category = ou_category;
		}

		public Object getThird_id() {
			return third_id;
		}

		public void setThird_id(Object third_id) {
			this.third_id = third_id;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Object getOu_type() {
			return ou_type;
		}

		public void setOu_type(Object ou_type) {
			this.ou_type = ou_type;
		}

		public Object getOu_address() {
			return ou_address;
		}

		public void setOu_address(Object ou_address) {
			this.ou_address = ou_address;
		}

		public Object getEmail() {
			return email;
		}

		public void setEmail(Object email) {
			this.email = email;
		}

		public Object getAddress() {
			return address;
		}

		public void setAddress(Object address) {
			this.address = address;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Object getTelephone() {
			return telephone;
		}

		public void setTelephone(Object telephone) {
			this.telephone = telephone;
		}

		public String getCorp_name() {
			return corp_name;
		}

		public void setCorp_name(String corp_name) {
			this.corp_name = corp_name;
		}

		public String getOu_rank() {
			return ou_rank;
		}

		public void setOu_rank(String ou_rank) {
			this.ou_rank = ou_rank;
		}

		public String getTmp_ou() {
			return tmp_ou;
		}

		public void setTmp_ou(String tmp_ou) {
			this.tmp_ou = tmp_ou;
		}

		public String getParent_id() {
			return parent_id;
		}

		public void setParent_id(String parent_id) {
			this.parent_id = parent_id;
		}
	}

	public static class UserIdentityListBean {
		/**
		 * org_name : 云南省环境监察总队
		 * org_id : 402848bd4830fed70148312e0efb0631
		 * org_full_name : 云南省环境监察总队
		 * corp_id : 402848bd4830fed70148312e0efb0631
		 * corp_shortname : 环境监察总队
		 * org_code : 0000000
		 * corp_code : 0000000
		 * ouinfo_category : 1
		 * org_shortname : 环境监察总队
		 * corp_name : 云南省环境监察总队
		 */

		private String org_name;
		private String org_id;
		private String org_full_name;
		private String corp_id;
		private String corp_shortname;
		private String org_code;
		private String corp_code;
		private String ouinfo_category;
		private String org_shortname;
		private String corp_name;

		public String getOrg_name() {
			return org_name;
		}

		public void setOrg_name(String org_name) {
			this.org_name = org_name;
		}

		public String getOrg_id() {
			return org_id;
		}

		public void setOrg_id(String org_id) {
			this.org_id = org_id;
		}

		public String getOrg_full_name() {
			return org_full_name;
		}

		public void setOrg_full_name(String org_full_name) {
			this.org_full_name = org_full_name;
		}

		public String getCorp_id() {
			return corp_id;
		}

		public void setCorp_id(String corp_id) {
			this.corp_id = corp_id;
		}

		public String getCorp_shortname() {
			return corp_shortname;
		}

		public void setCorp_shortname(String corp_shortname) {
			this.corp_shortname = corp_shortname;
		}

		public String getOrg_code() {
			return org_code;
		}

		public void setOrg_code(String org_code) {
			this.org_code = org_code;
		}

		public String getCorp_code() {
			return corp_code;
		}

		public void setCorp_code(String corp_code) {
			this.corp_code = corp_code;
		}

		public String getOuinfo_category() {
			return ouinfo_category;
		}

		public void setOuinfo_category(String ouinfo_category) {
			this.ouinfo_category = ouinfo_category;
		}

		public String getOrg_shortname() {
			return org_shortname;
		}

		public void setOrg_shortname(String org_shortname) {
			this.org_shortname = org_shortname;
		}

		public String getCorp_name() {
			return corp_name;
		}

		public void setCorp_name(String corp_name) {
			this.corp_name = corp_name;
		}
	}

	@Override
	public String toString() {
		return "LoginBean{" +
				"birthday='" + birthday + '\'' +
				", employer_id='" + employer_id + '\'' +
				", zip_code='" + zip_code + '\'' +
				", name_pinyin=" + name_pinyin +
				", password='" + password + '\'' +
				", memos='" + memos + '\'' +
				", card_id='" + card_id + '\'' +
				", order_no='" + order_no + '\'' +
				", third_id=" + third_id +
				", id='" + id + '\'' +
				", bank_id='" + bank_id + '\'' +
				", faxno='" + faxno + '\'' +
				", userToken='" + userToken + '\'' +
				", homeno='" + homeno + '\'' +
				", employed_date='" + employed_date + '\'' +
				", name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", bank_province='" + bank_province + '\'' +
				", userinfo_title=" + userinfo_title +
				", del_status=" + del_status +
				", bank_account='" + bank_account + '\'' +
				", office='" + office + '\'' +
				", vc_sshy=" + vc_sshy +
				", status='" + status + '\'' +
				", orgInfo=" + orgInfo +
				", bank_city='" + bank_city + '\'' +
				", is_default='" + is_default + '\'' +
				", vc_commper_book=" + vc_commper_book +
				", email=" + email +
				", address='" + address + '\'' +
				", login_name='" + login_name + '\'' +
				", ouinfo_id='" + ouinfo_id + '\'' +
				", jobtitle_id='" + jobtitle_id + '\'' +
				", telephone='" + telephone + '\'' +
				", joblevel_id='" + joblevel_id + '\'' +
				", mobile='" + mobile + '\'' +
				", work_date='" + work_date + '\'' +
				", userIdentityList=" + userIdentityList +
				'}';
	}
}
