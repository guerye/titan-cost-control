package com.riozenc.costControl;

import com.riozenc.titanTool.mongo.MongoPoolFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.riozenc.costControl",exclude = MongoAutoConfiguration.class)
public class CostControlApplication {
	public static void main(String[] args) {
		SpringApplication.run(CostControlApplication.class, args);
		MongoPoolFactory.init("titan", "df6100", "titan-billing");
	}
}
