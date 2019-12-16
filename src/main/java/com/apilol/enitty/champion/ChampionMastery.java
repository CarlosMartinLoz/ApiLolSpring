package com.apilol.enitty.champion;

import com.apilol.JSONReaders.ChampionsMetaData;
import com.apilol.exception.InitializeSingletonException;

public class ChampionMastery {
	private byte championLevel;
	private int championPoints;
	private int championId;
	private String championName;
	
	public ChampionMastery() {
		// TODO Auto-generated constructor stub
	}

	public byte getChampionLevel() {
		return championLevel;
	}

	public void setChampionLevel(byte championLevel) {
		this.championLevel = championLevel;
	}
	
	public int getChampionPoints() {
		return championPoints;
	}

	public void setChampionPoints(int championPoints) {
		this.championPoints = championPoints;
	}

	public int getChampionId() {
		return championId;
	}

	public void setChampionId(int championId) {
		this.championId = championId;
	}

	public String getChampionName() {
		return championName;
	}

	public void setChampionName(String championName) {
		this.championName = championName;
	}
	


	@Override
	public String toString() {
		return "ChampionMastery [championLevel=" + championLevel + ", championPoint=" + championPoints + ", championId="
				+ championId + ", championName=" + championName + "]";
	}
	
	

}
