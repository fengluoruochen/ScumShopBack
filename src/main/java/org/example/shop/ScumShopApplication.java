package org.example.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(exclude= SolrAutoConfiguration.class)
@MapperScan("org.example.shop.mapper")
@EnableJms
public class ScumShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScumShopApplication.class, args);
    }

}
