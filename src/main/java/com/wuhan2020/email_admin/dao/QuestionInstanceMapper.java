package com.wuhan2020.email_admin.dao;


import com.wuhan2020.email_admin.entity.QuestionInstance;


public interface QuestionInstanceMapper {
    int insert(QuestionInstance record);

    int insertSelective(QuestionInstance record);

    QuestionInstance getQuestionInstance(QuestionInstance record);

    int deleteQuestionInstance(QuestionInstance record);

    int updateQuestionInstance(QuestionInstance record);

}