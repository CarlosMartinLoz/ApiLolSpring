package com.apilol.enitty.match.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerData {
	
	@JsonProperty("summonerName")
	private String summonerName;
	
	@JsonProperty("currentAccountId")
	private String currentAccountId;
	
	@JsonProperty("playerMatchData")
	private PlayerMatchData playerMatchData;

	public void setPlayerMatchData(PlayerMatchData playerMatchData) {
		this.playerMatchData = playerMatchData;
	}

	@Override
	public String toString() {
		return "PlayerData [summonerName=" + summonerName + ", currentAccountId=" + currentAccountId + "]";
	}
	
	
}
