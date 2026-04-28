package com.truong.corebase;

import com.truong.corebase.config.JwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(JwtProperties.class)
public class CorebaseApplication {

	public static void main(String[] args) {
      SpringApplication.run(CorebaseApplication.class, args);
	}

}
