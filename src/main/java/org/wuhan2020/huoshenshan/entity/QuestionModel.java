package org.wuhan2020.huoshenshan.entity;

import java.util.Date;

public class QuestionModel {
    private Integer id;

    private Integer groupId;

    private Integer questionId;

    private String questionContent;

    private String questionSelectModel;

    private Date createTime;

    private Date updateTime;

    public QuestionModel() {
    }

    public QuestionModel(Integer groupId, Integer questionId) {
        this.groupId = groupId;
        this.questionId = questionId;
    }

    public QuestionModel(Integer id, Integer groupId, Integer questionId, String questionContent, String questionSelectModel, Date createTime, Date updateTime) {
        this.id = id;
        this.groupId = groupId;
        this.questionId = questionId;
        this.questionContent = questionContent;
        this.questionSelectModel = questionSelectModel;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }

    public String getQuestionSelectModel() {
        return questionSelectModel;
    }

    public void setQuestionSelectModel(String questionSelectModel) {
        this.questionSelectModel = questionSelectModel == null ? null : questionSelectModel.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "QuestionModel{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", questionId=" + questionId +
                ", questionContent='" + questionContent + '\'' +
                ", questionSelectModel='" + questionSelectModel + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
