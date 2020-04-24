package org.wuhan2020.huoshenshan.compoent;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DynamicDataSourceConfig {

	public static final String Source = "dataSource";


    @Bean
    @ConfigurationProperties("spring.datasource.druid.ds0")
    public DataSource ds0() {
        return new DruidDataSource();
    }

    @Bean
    @Primary
    public DynamicDataSource dataSource(DataSource ds0) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        //后期会去掉jdbc部分
        targetDataSources.put(Source + 0, ds0);

        return new DynamicDataSource(ds0, targetDataSources);
    }

}
