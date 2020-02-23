package com.wuhan2020.email_admin.service.Interface;

import com.wuhan2020.email_admin.entity.QuestionInstance;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan({"com.wuhan2020.email_admin.dao"})
public interface QuestionInstanceService {

    public QuestionInstance getQuestionInstance(QuestionInstance questionInstance);

    public int  updateQuestionInstance(QuestionInstance questionInstance);

    public int  deleteQuestionInstance(QuestionInstance questionInstance);

    public int  addQuestionInstance(QuestionInstance questionInstance);

}
