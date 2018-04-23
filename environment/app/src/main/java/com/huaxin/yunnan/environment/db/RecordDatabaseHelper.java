package com.huaxin.yunnan.environment.db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.huaxin.yunnan.environment.db.dao.bean.RecordDbBean;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Luckydog on 2017/9/4.
 * 1、整个DatabaseHelper使用单例只对外公布出一个对象，保证app中只存在一个SQLite Connection ， 参考文章：http://www.touchlab.co/2011/10/single-sqlite-connection/
 * 2、我们对每个Bean创建一个XXXDao来处理当前Bean的数据库操作，当然真正去和数据库打交道的对象，通过上面代码中的getDao（T t）进行获取
 * 3、getDao为一个泛型方法，会根据传入Class对象进行创建Dao，并且使用一个Map来保持所有的Dao对象，只有第一次调用时才会去调用底层的getDao()。
 */

public class RecordDatabaseHelper extends OrmLiteSqliteOpenHelper {

	private static final String TABLE_NAME = "sqlite-test.db";

	private Map<String, Dao> daos = new HashMap<String, Dao>();

	private RecordDatabaseHelper(Context context)
	{
		super(context, TABLE_NAME, null, 4);
	}

	@Override
	public void onCreate(SQLiteDatabase database,
						 ConnectionSource connectionSource)
	{
		try
		{
			//建表
			TableUtils.createTable(connectionSource, RecordDbBean.class);
		} catch (SQLException e)
		{
			e.printStackTrace();
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 更新
	 *
	 * @param database
	 * @param connectionSource
	 * @param oldVersion
	 * @param newVersion
	 */
	@Override
	public void onUpgrade(SQLiteDatabase database,
						  ConnectionSource connectionSource, int oldVersion, int newVersion)
	{
		try
		{
			TableUtils.dropTable(connectionSource, RecordDbBean.class, true);
			onCreate(database, connectionSource);
		} catch (SQLException e)
		{
			e.printStackTrace();
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
	}

	private static RecordDatabaseHelper instance;

	/**
	 * 单例获取该Helper
	 *
	 * @param context
	 * @return
	 */
	public static synchronized RecordDatabaseHelper getHelper(Context context)
	{
		context = context.getApplicationContext();
		if (instance == null)
		{
			synchronized (RecordDatabaseHelper.class)
			{
				if (instance == null)
					instance = new RecordDatabaseHelper(context);
			}
		}

		return instance;
	}

	/**
	 * 获取Dao类，通过Dao类可以对表里的数据进行增删改查
	 *
	 * @param clazz
	 * @return
	 * @throws SQLException
	 */
	public synchronized Dao getDao(Class clazz) throws SQLException
	{
		Dao dao = null;
		String className = clazz.getSimpleName();

		if (daos.containsKey(className))
		{
			dao = daos.get(className);
		}
		if (dao == null)
		{
			try {
				dao = super.getDao(clazz);
			} catch (java.sql.SQLException e) {
				e.printStackTrace();
			}
			daos.put(className, dao);
		}
		return dao;
	}

	/**
	 * 清除某个表内的数据
	 *
	 * @param clazz
	 */
	public synchronized void clearData(Class clazz) {
		try {
			TableUtils.clearTable(connectionSource, clazz);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 释放资源
	 */
	@Override
	public void close()
	{
		super.close();

		for (String key : daos.keySet())
		{
			Dao dao = daos.get(key);
			dao = null;
		}
	}
}
