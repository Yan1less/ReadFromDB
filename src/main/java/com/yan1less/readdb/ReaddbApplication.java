package com.yan1less.readdb;

import com.yan1less.readdb.aop.DynamicDataSourceAnnotationAdvisor;
import com.yan1less.readdb.aop.DynamicDataSourceAnnotationInterceptor;
import com.yan1less.readdb.register.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Import(DynamicDataSourceRegister.class)
@SpringBootApplication
@EnableTransactionManagement
@EnableDiscoveryClient
public class ReaddbApplication {
    @Bean
    public DynamicDataSourceAnnotationAdvisor dynamicDatasourceAnnotationAdvisor() {
        return new DynamicDataSourceAnnotationAdvisor(new DynamicDataSourceAnnotationInterceptor());
    }

    public static void main(String[] args) {
        SpringApplication.run(ReaddbApplication.class, args);
    }

}
