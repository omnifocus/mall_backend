package com.panda.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.panda.mall.order.feign")
@SpringBootApplication
public class MallOrderApplication {

	public static void main(String[] args) {

		SpringApplication.run(MallOrderApplication.class, args);
	}

}
