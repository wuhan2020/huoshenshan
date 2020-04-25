# huoshenshan

[![Build Status](https://travis-ci.org/wuhan2020/huoshenshan.svg?branch=master)](https://travis-ci.org/wuhan2020/huoshenshan)
[![codecov](https://codecov.io/gh/wuhan2020/huoshenshan/branch/master/graph/badge.svg)](https://codecov.io/gh/wuhan2020/huoshenshan)
![license](https://img.shields.io/github/license/wuhan2020/huoshenshan.svg)

火神山项目，Wuahan2020社区基础事务server端 Java 项目，[springboot](https://spring.io/projects/spring-boot) + [mybatis](http://mybatis.org/spring/zh/index.html)

## 快速启动
* 1、本地安装jdk14，mysql8(有点激进的版本)
* 2、初始化sql `/src/main/resources/sql/huoshenshan.sql`
* 3、在IDE 启动`src/main/java/org/wuhan2020/huoshenshan/HuoshenshanApplication.java` 主类
 
## 功能列表 
### TODO list
#### 黑客松音视频专题
 api 列表
* 1、查询单个视频的详情
* 2、查询视频分页列表（滑动查看时候）

#### 权限和加密：
  * http接口token接入：oauth ？或者其他非对称加密
  * 数据库等资源的配置加密
   
### 可能做的？
* 直播
* 用户(会员)系统

## 注意：
* 原型地址：https://github.com/wuhan2020/design-prototype
* 关键地方要写文档
* 注意安全事项
* 后面所有的接口都出自这里
