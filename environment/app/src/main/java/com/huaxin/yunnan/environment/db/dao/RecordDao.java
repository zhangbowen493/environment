package com.huaxin.yunnan.environment.db.dao;

import android.content.Context;

import com.huaxin.yunnan.environment.db.PollutionSuveryTakeDownDatabaseHelper;
import com.huaxin.yunnan.environment.db.RecordDatabaseHelper;
import com.huaxin.yunnan.environment.db.dao.bean.PollutionSurveryTakeDownDbBean;
import com.huaxin.yunnan.environment.db.dao.bean.RecordDbBean;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.misc.TransactionManager;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by zbw on 2018/1/29 17:21.
 */

public class RecordDao {

	private Context mContext;
	private Dao<RecordDbBean, Integer> dao;
	private static RecordDatabaseHelper helper;

	public static RecordDao instance;

	private RecordDao(Context context) throws SQLException {
		this.mContext = context;
		dao = helper.getDao(RecordDbBean.class);
	}

	public static synchronized RecordDao getInstance(Context context) {
		if (helper == null)
			helper = RecordDatabaseHelper.getHelper(context);
		if (instance == null) {
			synchronized (RecordDbBean.class) {

				try {
					instance = new RecordDao(context);
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
		return instance;
	}

	public void close() {
		if (helper != null)
			helper.close();
		helper = null;
		dao = null;
	}

	/**
	 * 限制总数据条数
	 *
	 * @param count 限制最低条数
	 * @return
	 * @throws SQLException
	 */
	public int limitData(final String count) throws SQLException {
		try {
			Callable<Integer> callable = new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					// TODO Auto-generated method stub
					// 倒序 取count 条数据id 不在id集合里 且满足 isupdate（是否上送银联） = 1 并且
					// SendUPTime（上送银联时间） 不为空 并且 synctime（上送后台时间不为空） != 0
					String sql = "delete from tb_tran_list where id not in (select id from tb_tran_list order by id DESC limit "
							+ count
							+ ") and isupdate = 1 and SendUPTime is not null and synctime != 0";
					int status = dao.executeRaw(sql);
					return status;
				}
			};
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}

	}

	/**
	 * 根据字段名 和 字段值 查找
	 *
	 * @param columnName  目前只有员工编号 字段名称
	 * @param columnValue 值
	 * @return
	 */
	public List<RecordDbBean> getLiushui(final String columnName,
														   final String columnValue) {
		try {
			Callable<List<RecordDbBean>> callable = new Callable<List<RecordDbBean>>() {
				@Override
				public List<RecordDbBean> call() throws Exception {
					// TODO Auto-generated method stub
					return dao.queryForEq(columnName, columnValue);
				}
			};
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 单条数据入库
	 *
	 * @return
	 */
	public Integer addData(final RecordDbBean bean) {

		// 事务操作
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws SQLException {
				return dao.create(bean);
			}
		};

		try {
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}

	}

	/**
	 * 批量加入数据
	 *
	 * @return
	 */
	public Integer addDataList(final ArrayList<RecordDbBean> lists) {
		// 事务操作
		try {
			Callable<Integer> callable = new Callable<Integer>() {
				@Override
				public Integer call() throws SQLException {
					for (RecordDbBean bean : lists) {
						int create = dao.create(bean);
						if (create != 1) {
							return create;
						}
					}
					return 1;
				}
			};
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * 批量更新
	 *
	 * @throws SQLException
	 */
	public int updateDataList(final ArrayList<RecordDbBean> lists) {
		try {
			Callable<Integer> callable = new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					for (RecordDbBean bean : lists) {
						int create = dao.update(bean);
						if (create != 1) {
							return create;
						}
					}
					return 1;
				}
			};
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return -1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * 数据库删除单条数据
	 *
	 * @param bean
	 * @return
	 */
	public int deleteData(final RecordDbBean bean) {
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				int delete = dao.delete(bean);
				return delete;
			}
		};
		try {
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return -1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * 删除指定数据列表
	 *
	 * @return
	 */
	public Integer deleteList(final List<RecordDbBean> lists) {
		try {
			Callable<Integer> callable = new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					// TODO Auto-generated method stub
					return dao.delete(lists);
				}
			};
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return -1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * 更新
	 *
	 * @throws SQLException
	 */
	public int updateData(final RecordDbBean bean) {
		try {
			Callable<Integer> callable = new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					// TODO Auto-generated method stub
					return dao.update(bean);
				}
			};
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return -1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * 查询所有
	 *
	 * @return
	 * @throws SQLException
	 */
	public List<RecordDbBean> queryAllDataList() {
		try {
			Callable<List<RecordDbBean>> callable = new Callable<List<RecordDbBean>>() {
				@Override
				public List<RecordDbBean> call() throws Exception {
					// TODO Auto-generated method stub
					return dao.queryForAll();
				}
			};
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取未清算列表
	 *
	 * @return
	 */
	public List<RecordDbBean> queryNoYLUpdateBean() {
		try {
			Callable<List<RecordDbBean>> callable = new Callable<List<RecordDbBean>>() {
				@Override
				public List<RecordDbBean> call() throws Exception {

					QueryBuilder<RecordDbBean, Integer> queryBuilder = dao
							.queryBuilder();
					queryBuilder.where().eq("isupdate", "0");
					queryBuilder.limit(150);
					return queryBuilder.query();
				}
			};
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取未清算数目
	 *
	 * @return
	 */
	public Long queryNoYLUpdateNum() {
		try {
			Callable<Long> callable = new Callable<Long>() {
				@Override
				public Long call() throws Exception {
					// TODO Auto-generated method stub
					QueryBuilder<RecordDbBean, Integer> queryBuilder = dao
							.queryBuilder();
					queryBuilder.where().eq("isupdate", "0");
					return queryBuilder.countOf();
				}
			};
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取指定参数数据
	 *
	 * @return
	 */
	public List<RecordDbBean> queryParametersBean(final String key,
																	final String value) {
		try {
			Callable<List<RecordDbBean>> callable = new Callable<List<RecordDbBean>>() {
				@Override
				public List<RecordDbBean> call() throws Exception {
					// TODO Auto-generated method stub
					return dao.queryForEq(key, value);
				}
			};
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * 清理所有数据
	 *
	 * @return
	 */
	public Long clearAll() {
		Callable<Long> callable = new Callable<Long>() {
			@Override
			public Long call() throws Exception {
				// TODO Auto-generated method stub
				return (long) dao.deleteBuilder().delete();
			}
		};
		try {
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 查询数据总条数
	 *
	 * @return
	 */
	public Long getCount() {
		Callable<Long> callable = new Callable<Long>() {
			@Override
			public Long call() throws Exception {
				// TODO Auto-generated method stub
				return dao.countOf();
			}
		};
		try {
			if (helper == null)
				helper = RecordDatabaseHelper.getHelper(mContext);
			return TransactionManager.callInTransaction(
					helper.getConnectionSource(), callable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return (long) 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return (long) 0;
		}
	}

}
