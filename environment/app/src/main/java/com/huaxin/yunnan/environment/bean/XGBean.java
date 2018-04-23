package com.huaxin.yunnan.environment.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zbw on 2017/12/9 16:59.
 */

public class XGBean implements  Serializable{


	/**
	 * key2 : 3342935287df4446a6db8a1244639f5a
	 * key1 : {"queryData":[{"read_status":"0","to_person":"admin","title":"你现在有一个标题为+a+的待办事项要处理","content_id":"王小金","activity_ins_id":"52d4e5024c124db28c41afaab38e3618","name":"待办事项","vc_status":"1","next_type_id":"3342935287df4446a6db8a1244639f5a","type_id":"402880ea601511cc016015270cf9015f","t_main_news_id":"402880D760434FD30160437F5B1504FC"}]}
	 */

	private String key2;
	private Key1Bean key1;

	public String getKey2() {
		return key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}

	public Key1Bean getKey1() {
		return key1;
	}

	public void setKey1(Key1Bean key1) {
		this.key1 = key1;
	}

	public static class Key1Bean {
		private List<QueryDataBean> queryData;

		public List<QueryDataBean> getQueryData() {
			return queryData;
		}

		public void setQueryData(List<QueryDataBean> queryData) {
			this.queryData = queryData;
		}

		public static class QueryDataBean implements Serializable{
			/**
			 * read_status : 0
			 * to_person : admin
			 * title : 你现在有一个标题为+a+的待办事项要处理
			 * content_id : 王小金
			 * activity_ins_id : 52d4e5024c124db28c41afaab38e3618
			 * name : 待办事项
			 * vc_status : 1
			 * next_type_id : 3342935287df4446a6db8a1244639f5a
			 * type_id : 402880ea601511cc016015270cf9015f
			 * t_main_news_id : 402880D760434FD30160437F5B1504FC
			 */

			private String read_status;
			private String to_person;
			private String title;
			private String content_id;
			private String activity_ins_id;
			private String name;
			private String vc_status;
			private String next_type_id;
			private String type_id;
			private String t_main_news_id;

			public String getRead_status() {
				return read_status;
			}

			public void setRead_status(String read_status) {
				this.read_status = read_status;
			}

			public String getTo_person() {
				return to_person;
			}

			public void setTo_person(String to_person) {
				this.to_person = to_person;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getContent_id() {
				return content_id;
			}

			public void setContent_id(String content_id) {
				this.content_id = content_id;
			}

			public String getActivity_ins_id() {
				return activity_ins_id;
			}

			public void setActivity_ins_id(String activity_ins_id) {
				this.activity_ins_id = activity_ins_id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getVc_status() {
				return vc_status;
			}

			public void setVc_status(String vc_status) {
				this.vc_status = vc_status;
			}

			public String getNext_type_id() {
				return next_type_id;
			}

			public void setNext_type_id(String next_type_id) {
				this.next_type_id = next_type_id;
			}

			public String getType_id() {
				return type_id;
			}

			public void setType_id(String type_id) {
				this.type_id = type_id;
			}

			public String getT_main_news_id() {
				return t_main_news_id;
			}

			public void setT_main_news_id(String t_main_news_id) {
				this.t_main_news_id = t_main_news_id;
			}
		}
	}
}
