package com.tarotdt.pas.common.model;

/**
 * 基础实体类
 */
public class BasePageModel {

    private int pageNum;//页码
    private int pageSize;//每页多少数据
    private String startTime;//开始时间
    private String endTime;//结束时间

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
