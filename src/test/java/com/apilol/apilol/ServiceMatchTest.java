package com.apilol.apilol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.apilol.apilol.service.ServiceMatchHistory;
import com.apilol.enitty.Match;

class ServiceMatchTest {
	private ServiceMatchHistory service;
	@Test
	void test() {
		Match[]matches=service.MatchHistory("14kVWlnr-rj2aq2lcrkyyAfGqeqi7y5uGyJI6siBPvfUzA");
		assertNotNull(matches);
		
	}

}
