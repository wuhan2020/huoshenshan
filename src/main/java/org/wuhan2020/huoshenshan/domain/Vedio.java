package org.wuhan2020.huoshenshan.domain;

import java.util.Date;

/**
 * @author wx
 */
public class Vedio {
    /**
     * 自增主键id
     */
    private Long id;
    /**
     * 视频文件名称
     */
    private String fileName;

    /**
     * 视频格式
     * MPEG/MPG/DAT/AVI/MOV/MP4
     */
    private String fileExtension;

    /**
     * 发布者用户id
     */
    private Long publisher;

    /**
     * 视频简介
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 第几期黑客松活动
     */
    private Integer hackathonId;

    /**
     * 黑客松活动的阶段
     * 1、闪电演讲 2、初赛 3、决赛
     */
    private Integer hackathonStage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Long getPublisher() {
        return publisher;
    }

    public void setPublisher(Long publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getHackathonId() {
        return hackathonId;
    }

    public void setHackathonId(Integer hackathonId) {
        this.hackathonId = hackathonId;
    }

    public Integer getHackathonStage() {
        return hackathonStage;
    }

    public void setHackathonStage(Integer hackathonStage) {
        this.hackathonStage = hackathonStage;
    }
}
