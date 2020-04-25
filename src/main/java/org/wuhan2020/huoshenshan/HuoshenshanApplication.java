package org.wuhan2020.huoshenshan;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.wuhan2020.huoshenshan.dao")
@SpringBootApplication(
        scanBasePackages = "org.wuhan2020.huoshenshan"
)
public class HuoshenshanApplication {
    private static final Logger logger = LoggerFactory.getLogger(HuoshenshanApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HuoshenshanApplication.class, args);
        logger.info("Huoshenshan项目启动!");
        System.out.println("Huoshenshan项目启动!");
    }

}
