package br.com.nutritech.motivationalquote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class MotivationalQuoteNutritechApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotivationalQuoteNutritechApplication.class, args);
	}

}
