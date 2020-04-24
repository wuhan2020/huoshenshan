package org.wuhan2020.huoshenshan.dao;


import org.wuhan2020.huoshenshan.entity.QuestionInstance;


public interface QuestionInstanceMapper {
    int insert(QuestionInstance record);

    int insertSelective(QuestionInstance record);

    QuestionInstance getQuestionInstance(QuestionInstance record);

    int deleteQuestionInstance(QuestionInstance record);

    int updateQuestionInstance(QuestionInstance record);

}
