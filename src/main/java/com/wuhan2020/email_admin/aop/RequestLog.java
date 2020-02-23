package com.wuhan2020.email_admin.aop;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestLog {

    String value() default "请求日志";

}
