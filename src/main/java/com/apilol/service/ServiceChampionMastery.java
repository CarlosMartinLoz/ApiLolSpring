package com.apilol.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.apilol.enitty.LeagueRank;
import com.apilol.enitty.champion.ChampionMastery;
import com.apilol.enitty.match.info.Matches;
import com.apilol.utility.factory.HeaderFactory;

@Service
public class ServiceChampionMastery {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private HeaderFactory header;
	

	
	
	public ChampionMastery [] findBestChampions(String summonerId) {
		HttpEntity<Map<String, String>> request = new HttpEntity<Map<String, String>>(null,
				header.getHeaders(header.DEFAULT));

		String fooResourceUrl = "https://euw1.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/"+summonerId;
		ResponseEntity<ChampionMastery[]> response = restTemplate.exchange(fooResourceUrl, HttpMethod.GET, request,
				ChampionMastery[].class);
		
		return response.getBody();
		
	}
	

}
