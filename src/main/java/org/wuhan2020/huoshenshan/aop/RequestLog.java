package org.wuhan2020.huoshenshan.aop;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestLog {

    String value() default "请求日志";

}
