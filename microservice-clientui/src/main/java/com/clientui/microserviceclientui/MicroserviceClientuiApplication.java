package com.clientui.microserviceclientui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
/*To use Feign, use this annotation with in parameter the package where we are*/
@EnableFeignClients("com.clientui")
@EnableDiscoveryClient
public class MicroserviceClientuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientuiApplication.class, args);
	}

}

