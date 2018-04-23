package com.huaxin.yunnan.environment.activity.todo;

import android.app.Activity;

import com.huaxin.yunnan.environment.Utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by zbw on 2017/11/28 11:16.
 */

public class DownloadFile {
	Activity context;
	String path;

	public DownloadFile(Activity context, String path) {
		this.context = context;
		this.path = path;
	}

	public int downloadFiles(String urlStr, String path, String fileName) {
		try {
			FileUtils fileUtils = new FileUtils();
			fileUtils.isFileExist(fileName, path);
			InputStream inputStream = getInputStreamFromUrl(urlStr);
			File resultFile = fileUtils.write2SDFromInput(fileName, path, inputStream);
			if (resultFile == null) return -1;
		} catch (Exception e) {
			System.out.println("读写数据异常:" + e);
			return -1;
		}
		return 0;
	}

	public InputStream getInputStreamFromUrl(String urlStr) throws IOException {
		//创建一个URL对象
		URL url = new URL(urlStr);
		//创建一个HTTP链接
		HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
		urlConn.setReadTimeout(30000);
		urlConn.setConnectTimeout(30000);
		//使用IO流获取数据
		InputStream inputStream = urlConn.getInputStream();
		return inputStream;
	}

}
