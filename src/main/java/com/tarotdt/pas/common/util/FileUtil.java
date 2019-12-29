package com.tarotdt.pas.common.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.Properties;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.tarotdt.pas.common.Constants;

public class FileUtil {

	/**
	 * 上传文件到指定路径
	 * 
	 * @param uploadFileName
	 *            上传文件名称
	 * @param path
	 *            保存路径
	 * @param in
	 *            文件输入流
	 * @return 文件保存是否成功
	 * @throws Exception
	 */
	public static boolean uploadFile(String uploadFileName, String path, InputStream in) throws Exception {
		// 创建文件
		File file = new File(path + uploadFileName);
		// 判断文件夹是否存在
		if (!file.exists()) {
			createDir(path);
		}
		// 创建数据流
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(file, "rw");
			int ch = 0;
			byte[] b = new byte[1024];
			// 将上传文件写入目标文件夹
			while ((ch = in.read(b)) != -1) {
				raf.write(b, 0, ch);
			}
			// 关闭流文件
			raf.close();
		} catch (Exception e) {
			// 异常处理
			e.printStackTrace();
			throw e;
		} finally {
			try {
				// 关闭流文件
				if (raf != null) {
					raf.close();
				}
			} catch (IOException e) {
				// 异常处理
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	/**
	 * 读取json文件
	 * 
	 * @param FileName
	 *            文件路径加文件名称 例：D:/Temp/test.json
	 * @return 返回文件中的json数据
	 * @throws Exception
	 */
	public static JSON readFile(String FileName) throws Exception {
		// 创建读取文件内容String
		StringBuffer str = new StringBuffer("");
		RandomAccessFile raf = new RandomAccessFile(FileName, "rw");
		String line = null;
		byte[] b = new byte[1024];
		int ch = 0;
		// 读取文件
		while ((ch = raf.read(b)) != -1) {
			line = new String(b, 0, ch, "utf-8");
			str.append(line);
		}
		raf.close();
		// 将文件内容转换为json格式
		JSON json = (JSON) JSONObject.parse(str.toString());
		return json;
	}

	/**
	 * 创建目录
	 * 
	 * @param destDirName
	 *            创建目录 例：D:/Temp/test
	 * @return 创建目录是否成功
	 */
	public static boolean createDir(String destDirName) {
		// 创建目录
		File dir = new File(destDirName);
		// 判断目录是否存在
		if (dir.exists()) {
			return false;
		}
		// 结尾是否以"/"结束
		if (!destDirName.endsWith(File.separator)) {
			destDirName = destDirName + File.separator;
		}
		// 创建目标目录
		if (dir.mkdirs()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 删除文件
	 * 
	 * @param fileName
	 *            删除文件 例：D:/Temp/test.json
	 */
	public static void deleteFile(String fileName) {
		// 创建文件
		File file = new File(fileName);
		// 判断文件是否存在,如果存在删除
		if (file.exists()) {
			file.delete();
		}
	}

	/**
	 * 截取文件后缀
	 * 
	 * @param fileName
	 *            文件名 例：test.json
	 * @return 返回截取后缀 例：.json
	 */
	public static String fileType(String fileName) {
		// 截取文件后缀
		return fileName.substring(fileName.lastIndexOf("."));
	}

	/**
	 * 文件读写
	 * 
	 * @param readFileName
	 *            读取文件 例：D:/Temp/test.json
	 * @param writeFileName
	 *            写入文件 例：D:/Temp/test1.json
	 * @return 是否写入成功
	 */
	public static boolean sampleFile(String readFileName, String writeFileName, int writeLine) {
		// 创建读取文件流
		RandomAccessFile rf = null;
		// 创建写入文件流
		RandomAccessFile wf = null;
		try {
			rf = new RandomAccessFile(readFileName, "r");
			wf = new RandomAccessFile(writeFileName, "rw");
			String line = null;
			// 处理需要取得样本文件行数
			int i = 0;
			// 循环读取文件
			while ((line = rf.readLine()) != null) {
				// 写入文件
				wf.write((line + "\r\n").getBytes());
				// 写入行数
				i++;
				// 判断写入行数
				if (i == writeLine) {
					break;
				}
			}
			// 关闭流文件
			rf.close();
			wf.close();
		} catch (Exception e) {
			// 异常处理
			e.printStackTrace();
			return false;
		} finally {
			try {
				// 关闭流文件
				if (rf != null) {
					rf.close();
				}
				// 关闭流文件
				if (wf != null) {
					wf.close();
				}
			} catch (Exception e) {
				// 异常处理
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	/**
	 * 处理返回值
	 * 
	 * @param map
	 *            数据结果集
	 * @param cla
	 *            返回实体类
	 * @param type
	 *            查询结果类型
	 * @return 返回实体类
	 */
	public static <T> T getResult(Map<String, Object> map, Class<T> cla, String type) {
		JSON json = (JSON) map.get(type);
		T t = JSON.parseObject(json.toJSONString(), cla);
		return t;
	}

	/**
	 * 查询Properties文件
	 * 
	 * @param type
	 *            Properties文件键
	 * @return 值
	 * @throws Exception
	 */
	public static String getProperties(String type) throws Exception {
		InputStream in = FileUtil.class.getResourceAsStream(Constants.DATASOURCEPROPERTIES);
		Properties p = new Properties();
		p.load(in);
		return p.getProperty(type);
	}
	
	/**
	 * 读取json文件
	 * 
	 * @param FileName
	 *            文件路径加文件名称 例：D:/Temp/test.json
	 * @return 返回文件中的json数据
	 * @throws Exception
	 */
	public static <T> T  readFile(String FileName,Class<T> cla) throws Exception {
		// 创建读取文件内容String
		StringBuffer str = new StringBuffer("");
		RandomAccessFile raf = new RandomAccessFile(FileName, "rw");
		String line = null;
		byte[] b = new byte[1024];
		int ch = 0;
		// 读取文件
		while ((ch = raf.read(b)) != -1) {
			line = new String(b, 0, ch, "utf-8");
			str.append(line);
		}
		raf.close();
		// 将文件内容转换为json格式
		Gson gson = new Gson();  
        T res = gson.fromJson(str.toString(), cla);  
		return res;
	}
}
