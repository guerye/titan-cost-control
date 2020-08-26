package com.riozenc.prepaid;

import com.riozenc.titanTool.mongo.MongoPoolFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.riozenc.prepaid",exclude = MongoAutoConfiguration.class)
public class PrepaidApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrepaidApplication.class, args);
		MongoPoolFactory.init("titan", "df6100", "titan-billing");
	}
}
