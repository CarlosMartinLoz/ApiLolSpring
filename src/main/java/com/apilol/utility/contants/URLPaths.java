package com.apilol.utility.contants;

//Contenedor de las URL para facil modificacion
public class URLPaths {
	
	private static final String URLProfile = "https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/"
			, URLMatchHistory ="https://euw1.api.riotgames.com/lol/match/v4/matchlists/by-account/"
			, URLMatchDetails="https://euw1.api.riotgames.com/lol/match/v4/matches/";
	
	public static String URLProfile() {
		return URLProfile;
	}

	public static String getUrlprofile() {
		return URLProfile;
	}

	public static String getUrlmatchhistory() {
		return URLMatchHistory;
	}

	public static String getUrlmatchdetails() {
		return URLMatchDetails;
	}
}
