package com.apilol.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.apilol.enitty.User;
import com.apilol.enitty.match.info.Matches;
import com.apilol.service.ServiceMatchHistory;
import com.apilol.service.ServicePlayerInfo;

@RestController
@CrossOrigin(origins = "*")
public class RestMatch {
	
	@Autowired
	private ServicePlayerInfo service;
	
	@Autowired
	private ServiceMatchHistory serviceMatch;
	
	@GetMapping("user/{name}")
	public User findByName(@PathVariable("name") String name) {
		System.out.println(name);
		return service.findByName(name);
	}
	
	@GetMapping("matches/{accountId}")
	public Matches matchesByAccountId(@PathVariable("accountId") String accountId) {
		return serviceMatch.MatchHistory(accountId);
	}

}
