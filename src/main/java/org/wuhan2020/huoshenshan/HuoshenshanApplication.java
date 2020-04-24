package org.wuhan2020.huoshenshan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.wuhan2020.huoshenshan.dao")

@SpringBootApplication(
        scanBasePackages = "org.wuhan2020.huoshenshan"
)
public class HuoshenshanApplication {

    public static void main(String[] args) {
          SpringApplication.run(HuoshenshanApplication.class, args);
    }

}
