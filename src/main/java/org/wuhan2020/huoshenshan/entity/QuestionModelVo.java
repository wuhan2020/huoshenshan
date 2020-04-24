package org.wuhan2020.huoshenshan.entity;

import java.io.Serializable;

/**
 * @program: email_admin
 * @description: 返回Vo
 * @author: Nou
 * @create: 2020-01-15 16:19
 **/

public class QuestionModelVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer groupId;

    private Integer questionId;

    private String questionContent;

    private String questionSelectModel;


    public static long getSerialVersionUID() {
        return serialVersionUID;
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
        this.questionContent = questionContent;
    }

    public String getQuestionSelectModel() {
        return questionSelectModel;
    }

    public void setQuestionSelectModel(String questionSelectModel) {
        this.questionSelectModel = questionSelectModel;
    }

    @Override
    public String toString() {
        return "QuestionModelVo{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", questionId=" + questionId +
                ", questionContent='" + questionContent + '\'' +
                ", questionSelectModel='" + questionSelectModel + '\'' +
                '}';
    }
}
