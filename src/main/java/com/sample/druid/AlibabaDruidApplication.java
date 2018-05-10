package com.sample.druid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AlibabaDruidApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlibabaDruidApplication.class, args);
	}
}
