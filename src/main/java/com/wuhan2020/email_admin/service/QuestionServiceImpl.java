package com.wuhan2020.email_admin.service;


import com.wuhan2020.email_admin.dao.QuestionModelMapper;
import com.wuhan2020.email_admin.entity.QuestionModel;
import com.wuhan2020.email_admin.service.Interface.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: email_admin
 * @description:
 * @author: Nou
 * @create: 2020-01-14 17:54
 **/
@Service
public class QuestionServiceImpl implements QuestionService {
    @Resource
    private QuestionModelMapper questionModelMapper;
    @Override
    public QuestionModel getQuestionModel(QuestionModel questionModel) {
        return questionModelMapper.getQuestionModel(questionModel);
    }

    @Override
    public List<QuestionModel> getQuestionModelList(QuestionModel questionModel) {
        return questionModelMapper.getQuestionModelList(questionModel);
    }

    @Override
    public int updateQuestionModel(QuestionModel questionModel) {
        return questionModelMapper.updateQuestionModel(questionModel);
    }

    @Override
    public int deleteQuestionModel(QuestionModel questionModel) {
        return questionModelMapper.deleteQuestionModel(questionModel);
    }

    @Override
    public int addQuestionModel(QuestionModel questionModel) {

        return questionModelMapper.insertSelective(questionModel);
    }


}
