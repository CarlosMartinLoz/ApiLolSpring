package com.apilol.apilol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.apilol.apilol.service.ServicePlayerInfo;
import com.apilol.enitty.Player;

class ServiceUserLolTest {
	
	private ServicePlayerInfo service;
	
	@Test
	void test() {
		service = new ServicePlayerInfo();
		Player player= service.findByName("Feizan");
		System.out.println("Hola"+player);
		assertNotNull(player);
	}

}
