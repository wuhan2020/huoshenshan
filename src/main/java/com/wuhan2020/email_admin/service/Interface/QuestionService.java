package com.wuhan2020.email_admin.service.Interface;

import com.wuhan2020.email_admin.entity.QuestionModel;

import java.util.List;

public interface QuestionService {

    public QuestionModel getQuestionModel(QuestionModel questionModel);

    public List<QuestionModel> getQuestionModelList(QuestionModel questionModel);


    public int  updateQuestionModel(QuestionModel questionModel);

    public int  deleteQuestionModel(QuestionModel questionModel);

    public int addQuestionModel(QuestionModel questionModel);
}
