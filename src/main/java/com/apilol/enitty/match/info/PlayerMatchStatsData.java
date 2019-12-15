package com.apilol.enitty.match.info;

import com.fasterxml.jackson.annotation.JsonProperty;

/*Estadisticas en la partida del jugador*/
public class PlayerMatchStatsData {
	@JsonProperty("visionScore")
	private int visionScore;
	@JsonProperty("kills")
	private int kills;
	@JsonProperty("assists")
	private int assists;
	@JsonProperty("deaths")
	private int deaths;
	
	
	public PlayerMatchStatsData() {
		
	}
	
	public PlayerMatchStatsData(int visionScore, int kills, int assists) {
		
		this.visionScore = visionScore;
		this.kills = kills;
		this.assists = assists;
	}
	
	
	public int getVisionScore() {
		return visionScore;
	}
	public void setVisionScore(int visionScore) {
		this.visionScore = visionScore;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}

	@Override
	public String toString() {
		return "PlayerMatchStatsData [visionScore=" + visionScore + ", kills=" + kills + ", assists=" + assists + "]";
	}
	
	
	
}
