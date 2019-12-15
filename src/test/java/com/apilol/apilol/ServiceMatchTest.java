package com.apilol.apilol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.apilol.enitty.match.info.Match;
import com.apilol.enitty.match.info.Matches;
import com.apilol.service.ServiceMatchHistory;
import com.apilol.service.ServicePlayerInfo;
import com.apilol.utility.factory.HeaderFactory;
@SpringBootTest(classes = {RestTemplate.class, ServiceMatchHistory.class, HeaderFactory.class})
class ServiceMatchTest {
	
	@Autowired
	private ServiceMatchHistory service;
	
	@Test
	void test() {
		long time = System.nanoTime();
		
		Matches matches=service.MatchHistory("sd");
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - time;
		System.out.println("Time:"+totalTime/ 1_000_000_000.0);
		
	}

}
