package org.wuhan2020.huoshenshan.service;

import org.wuhan2020.huoshenshan.entity.QuestionModel;

import java.util.List;

public interface QuestionService {

    public QuestionModel getQuestionModel(QuestionModel questionModel);

    public List<QuestionModel> getQuestionModelList(QuestionModel questionModel);


    public int  updateQuestionModel(QuestionModel questionModel);

    public int  deleteQuestionModel(QuestionModel questionModel);

    public int addQuestionModel(QuestionModel questionModel);
}
