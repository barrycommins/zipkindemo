package com.barrycommins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class ZipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinserverApplication.class, args);
	}
}
