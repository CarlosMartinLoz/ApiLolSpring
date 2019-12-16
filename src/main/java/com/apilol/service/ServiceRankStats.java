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
import com.apilol.utility.contants.URLPaths;
import com.apilol.utility.factory.HeaderFactory;

@Service
public class ServiceRankStats {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private HeaderFactory header;
	
	public LeagueRank findRankUser(String summonerId) {
		HttpEntity<Map<String, String>> request = new HttpEntity<Map<String, String>>(null,
				header.getHeaders(header.DEFAULT));

		String fooResourceUrl = URLPaths.getUrlrankdetailts()+summonerId;
		ResponseEntity<LeagueRank[]> response = restTemplate.exchange(fooResourceUrl, HttpMethod.GET, request,
				LeagueRank[].class);
		//Queremos devolver tan solo soloQ no flex ni  3 vs 3
		LeagueRank [] leagues= response.getBody();
		LeagueRank soloq = null;
		
		for(int i = 0;i <leagues.length;i++) {
			if(leagues[i].getQueueType().equals("RANKED_SOLO_5x5")) {
				soloq = leagues[i];
				break;
				
			}
		}
		
		if(soloq==null) {
			soloq = new LeagueRank();
		}
		return soloq;
		
		
	}

}
