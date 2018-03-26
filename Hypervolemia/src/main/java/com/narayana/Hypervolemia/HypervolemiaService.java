package com.narayana.Hypervolemia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class HypervolemiaService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HypervolemiaService.class, args);

	}

}
