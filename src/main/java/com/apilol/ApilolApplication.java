package com.apilol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.apilol.JSONReaders.ChampionsMetaData;
import com.apilol.exception.InitializeSingletonException;

@SpringBootApplication

public class ApilolApplication {

	public static void main(String[] args) {
		try {
			ChampionsMetaData.initializeInstance();
		} catch (InitializeSingletonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SpringApplication.run(ApilolApplication.class, args);
	}
	


}
