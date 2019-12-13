package com.apilol.apilol.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.apilol.enitty.Match;
import com.apilol.enitty.Matches;
import com.apilol.enitty.Player;

@Service
public class ServiceMatchHistory {

	public Matches MatchHistory(String accountId) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Origin","https://developer.riotgames.com");
		headers.set("Accept-Charset","application/x-www-form-urlencoded; charset=UTF-8");
		headers.set("X-Riot-Token","RGAPI-620fd551-3ae3-4771-8459-03ec41c30b27");
		headers.set("Accept-Language","es-ES,es;q=0.5");
		headers.set("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36 Edge/18.18362");
		
		HttpEntity<Map <String,String>> request = new HttpEntity<Map <String,String>>(null,headers);
		
		String fooResourceUrl
		  = "https://euw1.api.riotgames.com/lol/match/v4/matchlists/by-account/"+accountId;
		ResponseEntity<Matches> response
		  = restTemplate.exchange(fooResourceUrl,HttpMethod.GET,request, Matches.class);
		System.out.println(response.getStatusCodeValue());
		return response.getBody();
	}

}
