package com.BrinkerInc.BrinkerIncUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BrinkerIncUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrinkerIncUserApplication.class, args);
	}

}
