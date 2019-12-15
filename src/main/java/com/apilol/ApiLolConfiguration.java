package com.apilol;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//Despacho de beans en caso de querer crear un bean hazlo aqui, excepto que tenga mucho sentido que sea en otra clase
@Configuration
public class ApiLolConfiguration {
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	   return builder.build();
	}
}
