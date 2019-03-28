package com.oc.wildadventures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
/*To enable the generation of documentation*/
@EnableSwagger2
@EnableDiscoveryClient
public class WildadventuresApplication {

	public static void main(String[] args) {
		SpringApplication.run(WildadventuresApplication.class, args);
	}

}

