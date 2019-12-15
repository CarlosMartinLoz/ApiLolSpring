package com.apilol.apilol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.apilol.enitty.User;
import com.apilol.service.ServiceMatchHistory;
import com.apilol.service.ServicePlayerInfo;
import com.apilol.utility.factory.HeaderFactory;
@SpringBootTest(classes = {RestTemplate.class, ServicePlayerInfo.class, HeaderFactory.class})
class ServiceUserLolTest {
	
	@Autowired
	private ServicePlayerInfo service;
	
	@Test
	void test() {
		long time = System.nanoTime();
		service = new ServicePlayerInfo();
		User player= service.findByName("Feizan");
		System.out.println("Hola"+player);
		assertNotNull(player);
		long endTime   = System.nanoTime();
		long totalTime = endTime - time;
		System.out.println(totalTime/ 1_000_000_000.0);
	}

}
