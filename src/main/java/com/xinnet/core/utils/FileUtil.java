package com.xinnet.core.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class FileUtil {
	/**通用路径分隔符*/
	private static String sep = java.io.File.separator;
	private static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 
	 * 功能描述：将文件名字更改成唯一
	 *
	 * @return
	 *
	 * @author 王湛智[wangzhanzhi@xinnet.com]
	 *
	 * @since 2014年2月18日
	 *
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public static String makeName(String picName) {
		return UUID.randomUUID().toString() + "_" + picName;
	}
	/**
	 * 
	 * 功能描述：将上传路径更改
	 *
	 * @return
	 *
	 * @author 王湛智[wangzhanzhi@xinnet.com]
	 *
	 * @since 2014年2月18日
	 *
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public synchronized static String makePath(String filePath) {
		String[] date = sf.format(new Date()).split("-");
		String path = filePath + sep + date[0] + sep + date[1] + sep + date[2];
		File file = new File(path);
		if(!file.exists())
			file.mkdirs();
		return path;
	}
}
