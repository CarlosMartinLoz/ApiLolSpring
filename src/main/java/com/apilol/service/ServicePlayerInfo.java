package com.apilol.service;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.apilol.enitty.User;
import com.apilol.utility.contants.URLPaths;
import com.apilol.utility.factory.HeaderFactory;

/*Servicio para la primera llamada para obtener la informacion del usuario*/
@Service
public class ServicePlayerInfo {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private HeaderFactory header;
	
	public User findByName(String name) {
		HttpHeaders headers = header.getHeaders(header.DEFAULT);
		HttpEntity<Map <String,String>> request = new HttpEntity<Map <String,String>>(null,headers);
		
		String fooResourceUrl = URLPaths.URLProfile()+name;
		ResponseEntity<User> response= restTemplate.exchange(fooResourceUrl,HttpMethod.GET,request, User.class);
		
		return response.getBody();
	}
	

}
