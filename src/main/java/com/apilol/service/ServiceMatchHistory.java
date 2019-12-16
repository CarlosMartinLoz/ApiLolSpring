package com.apilol.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.apilol.enitty.User;
import com.apilol.enitty.match.info.Match;
import com.apilol.enitty.match.info.Matches;
import com.apilol.utility.factory.HeaderFactory;

@Service
public class ServiceMatchHistory {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private HeaderFactory header;
	

	
	public Matches MatchHistory(String accountId) {

		HttpEntity<Map<String, String>> request = new HttpEntity<Map<String, String>>(null,
				header.getHeaders(header.DEFAULT));

		String fooResourceUrl = "https://euw1.api.riotgames.com/lol/match/v4/matchlists/by-account/14kVWlnr-rj2aq2lcrkyyAfGqeqi7y5uGyJI6siBPvfUzA?endIndex=1&beginIndex=0";
		ResponseEntity<Matches> response = restTemplate.exchange(fooResourceUrl, HttpMethod.GET, request,
				Matches.class);
		
		return matchPlayers(response.getBody());
	}
	
	public Matches matchPlayers(Matches matches) {
		HttpEntity<Map<String, String>> request = new HttpEntity<Map<String, String>>(null,header.getHeaders(header.DEFAULT));
		
		for (int i = 0; i < matches.getMatches().length; i++) {
		
			String fooResourceUrl2 = "https://euw1.api.riotgames.com/lol/match/v4/matches/"+matches.getMatches()[i].getGameId();
			
			ResponseEntity<Match> response = restTemplate.exchange(fooResourceUrl2, HttpMethod.GET, request,
					Match.class);
			matches.getMatches()[i]= response.getBody();
			matches.getMatches()[i].format();
			
		}
		
		return matches;
	}
	

}
