package org.wuhan2020.huoshenshan.dao;


import org.wuhan2020.huoshenshan.entity.QuestionModel;

import java.util.List;

public interface QuestionModelMapper {
    int insert(QuestionModel record);

    int insertSelective(QuestionModel record);

    QuestionModel getQuestionModel(QuestionModel questionModel);

    int updateQuestionModel(QuestionModel questionModel);

    int deleteQuestionModel(QuestionModel questionModel);

    List<QuestionModel> getQuestionModelList(QuestionModel questionModel);


}
