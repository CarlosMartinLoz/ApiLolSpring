package com.apilol.apilol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apilol.apilol.service.ServiceMatchHistory;
import com.apilol.apilol.service.ServicePlayerInfo;
import com.apilol.enitty.Match;
import com.apilol.enitty.Matches;
import com.apilol.enitty.Player;

@RestController
@CrossOrigin(origins = "*")
public class RestMatch {
	
	@Autowired
	private ServicePlayerInfo service;
	
	@Autowired
	private ServiceMatchHistory serviceMatch;
	
	@GetMapping("user/{name}")
	public Player findByName(@PathVariable("name") String name) {
		System.out.println(name);
		return service.findByName(name);
	}
	
	@GetMapping("matches/{accountId}")
	public Matches matchesByAccountId(@PathVariable("accountId") String accountId) {
		return serviceMatch.MatchHistory(accountId);
	}

}
