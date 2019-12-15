package com.apilol.enitty.match.info;

import com.fasterxml.jackson.annotation.JsonProperty;
/*Datos generales sobre el jugador en la partida, contiene el objeto playerstats que sera el que tenga la informacion
 * sobre el desarrollo de la partida*/
public class PlayerMatchData {
	@JsonProperty("spell1Id")
	private int spell1Id;
	
	@JsonProperty("participantId")
	private int participantId;
	
	@JsonProperty("spell2Id")
	private int spell2Id;
	
	@JsonProperty("teamId")
	private int teamId;
	
	@JsonProperty("win")
	private boolean win;
	
	@JsonProperty("championId")
	private int championId;
	
	@JsonProperty("champion")
	private String champion;
	
	@JsonProperty("stats")
	private PlayerMatchStatsData stats;
	
	

	public int getChampionId() {
		return championId;
	}

	public void setChampion(String champion) {
		this.champion = champion;
	}

	@Override
	public String toString() {
		return "PlayerMatchData [spell1Id=" + spell1Id + "]";
	}
	
	
}
