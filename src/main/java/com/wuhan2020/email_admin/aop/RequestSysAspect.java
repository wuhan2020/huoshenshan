package com.wuhan2020.email_admin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class RequestSysAspect {

    private static final Logger LOG = LoggerFactory.getLogger(RequestLog.class);
    /**
     * 切点
     */
    @Pointcut("@annotation(com.wuhan2020.email_admin.aop.RequestLog)")
    public void logPointCut() {

    }

    /**
     * 前置通知
     *
     * @param joinPoint 连接点
     */
    @Before("logPointCut()")
    public void printSysLog(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        LOG.info("request method = {} and paramName = {}, params = {}",  signature.getName(), signature.getParameterNames(), joinPoint.getArgs());
    }

}
