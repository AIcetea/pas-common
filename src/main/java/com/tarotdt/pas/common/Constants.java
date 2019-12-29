package com.tarotdt.pas.common;

/**
 * 常量类
 * 
 * @author lir
 *
 */
public class Constants {
	/**
	 * 用户上传初始文件名
	 */
	public static final String INITIALFILENAME = "initial";
	/**
	 * 处理过的样本文件名
	 */
	public static final String SAMPLEFILENAME = "sample";
	/**
	 * 文件分析json文件
	 */
	public static final String ANALYSISJSONFILENAME = "analysis.json";
	/**
	 * 文件分析json文件
	 */
	public static final String DATASETJSONFILENAME = "dataset.json";
	/**
	 * log日志文件
	 */
	public static final String LOGFILENAME = "log.json";
	/**
	 * 样本文件Json格式
	 */
	public static final String SAMPLEJSONFILENAME = "sampleJson.json";
	/**
	 * 存储chartsList信息json
	 */
	public static final String CHARTSLISTFILENAME = "chartsList.json";
	/**
	 * 存储charts路径
	 */
	public static final String CHARTSPATH = "/charts/";
	/**
	 * dataSource.json
	 */
	public static final String DATASOURCEFILENAME = "dataSource.json";
	/**
	 * baseContent.json
	 */
	public static final String BASECONTENTJSONFILENAME = "baseContent.json";
	/**
	 * 存储task路径
	 */
	public static final String TASKPATH="/task/";
	/**
	 * task.json
	 */
	public static final String TASKJSONFILENAME = "task.json";
	/**
	 *pas-version.json
	 */
	public static final String VERSIONJSONFILENAME = "pas-version.json";
	/**
	 * dataSource.properties
	 */
	public static final String DATASOURCEPROPERTIES="/dataSource.properties";

    /**
     * 数据源类型 LOCAL_FILE 本地文件 FTP_HTTP_FILE ftp/http文件 DATABASE 数据库 HDFS_FILE
     * hdfs文件
     * 
     * @author robin
     *
     */
    public static enum DataSetType {
        LOCAL_FILE, FTP_HTTP_FILE, DATABASE, HDFS_FILE
    }
}
