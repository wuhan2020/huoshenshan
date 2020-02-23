package com.wuhan2020.email_admin.service;

import com.wuhan2020.email_admin.dao.QuestionInstanceMapper;
import com.wuhan2020.email_admin.entity.QuestionInstance;
import com.wuhan2020.email_admin.service.Interface.QuestionInstanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: email_admin
 * @description:
 * @author: Nou
 * @create: 2020-01-14 17:54
 **/
@Service
public class QuestionInstanceServiceImpl implements QuestionInstanceService {
    @Resource
    private QuestionInstanceMapper questionInstanceMapper;
    @Override
    public QuestionInstance getQuestionInstance(QuestionInstance questionInstance) {
        return questionInstanceMapper.getQuestionInstance(questionInstance);
    }

    @Override
    public int updateQuestionInstance(QuestionInstance questionInstance) {
        return questionInstanceMapper.updateQuestionInstance(questionInstance);
    }

    @Override
    public int deleteQuestionInstance(QuestionInstance questionInstance) {
        return questionInstanceMapper.deleteQuestionInstance(questionInstance);
    }

    @Override
    public int addQuestionInstance(QuestionInstance questionInstance) {
        return questionInstanceMapper.insertSelective(questionInstance);
    }
}
