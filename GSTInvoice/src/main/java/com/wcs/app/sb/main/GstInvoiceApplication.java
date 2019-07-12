package com.wcs.app.sb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class GstInvoiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GstInvoiceApplication.class, args);
	}

}
