package org.wuhan2020.huoshenshan.entity;

import java.util.Date;

public class QuestionInstance {
    private Integer id;

    private Integer questionId;

    private String questionContent;

    private String questionSelectContent;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private Boolean deleted;

    public QuestionInstance(Integer questionId, String questionContent, String questionSelectContent) {
        this.questionId = questionId;
        this.questionContent = questionContent;
        this.questionSelectContent = questionSelectContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getQuestionSelectContent() {
        return questionSelectContent;
    }

    public void setQuestionSelectContent(String questionSelectContent) {
        this.questionSelectContent = questionSelectContent == null ? null : questionSelectContent.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
