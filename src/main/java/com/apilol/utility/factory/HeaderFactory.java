package com.apilol.utility.factory;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
//Factory para abstraer la creacion de los header. En caso de nuevo header incluir aqui
@Component
public class HeaderFactory {
	private final String key = "RGAPI-685e6d8f-7435-4d8a-b41b-ad10a906cad5";
	public final String DEFAULT = "DEFAULT";

	public HttpHeaders getHeaders(String comand) {
		HttpHeaders headers = new HttpHeaders();
		switch (comand) {

			case DEFAULT:	
				headers.setContentType(MediaType.APPLICATION_JSON);
				headers.set("Origin", "https://developer.riotgames.com");
				headers.set("Accept-Charset", "application/x-www-form-urlencoded; charset=UTF-8");
				headers.set("X-Riot-Token", key);
				headers.set("Accept-Language", "es-ES,es;q=0.5");
				headers.set("User-Agent",
					"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36 Edge/18.18362");
				break;

			default:
				throw new UnsupportedOperationException("No existe este comando en el Factory");
		}
		return headers;
	}

}
