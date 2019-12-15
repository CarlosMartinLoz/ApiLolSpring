package com.apilol.enitty.match.info;

import java.util.Arrays;
import com.apilol.JSONReaders.ChampionsMetaData;
import com.apilol.enitty.User;
import com.apilol.exception.InitializeSingletonException;
import com.fasterxml.jackson.annotation.JsonProperty;

/*Clase contenedora de las partidas cumple una doble funcion obteniendo la informacion del primer request al endpoint ***
 * y tambien luego se sobreescribira con la informacion del segundo request de manera que esta la info que se mande a el frontend 
 * */
 
public class Match {

	private long gameId;
	private short champion;
	private String lane;
	private String platformId;
	private short queue;
	private byte season;

	@JsonProperty("participantIdentities")
	private Player[] participantIdentities;

	@JsonProperty("participants")
	private PlayerMatchData[] participantData;

	public Match() {
		super();
	}

	public Match(long gameId, short champion, String lane, String platformId, long timestamp, short queue,
			byte season) {
		super();
		this.gameId = gameId;
		this.champion = champion;
		this.lane = lane;
		this.platformId = platformId;
	
		this.queue = queue;
		this.season = season;
	}

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public short getChampion() {
		return champion;
	}

	public void setChampion(short champion) {
		this.champion = champion;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}



	public short getQueue() {
		return queue;
	}

	public void setQueue(short queue) {
		this.queue = queue;
	}

	public byte getSeason() {
		return season;
	}

	public void setSeason(byte season) {
		this.season = season;
	}

	public Player[] getParticipantIdentities() {
		return participantIdentities;
	}

	public void setParticipantIdentities(Player[] participantIdentities) {
		this.participantIdentities = participantIdentities;
	}

	public PlayerMatchData[] getParticipantData() {
		return participantData;
	}

	public void setParticipantData(PlayerMatchData[] participantData) {
		this.participantData = participantData;
	}

	public void format() {
		ChampionsMetaData champs;
		
		try {
			champs = ChampionsMetaData.getInstance();

			for (int i = 0; i < participantIdentities.length; i++) {
				String championName = champs.getChampionDataById(participantData[i].getChampionId());
				participantData[i].setChampion(championName);
				participantIdentities[i].getPlayerData().setPlayerMatchData(participantData[i]);

			}

		} catch (InitializeSingletonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		participantData = null;
	}

	@Override
	public String toString() {
		return "Match [gameId=" + gameId + ", champion=" + champion + ", lane=" + lane + ", platformId=" + platformId
				+ ", queue=" + queue + ", season=" + season + ", participantIdentities="
				+ Arrays.toString(participantIdentities) + ", participantData=" + Arrays.toString(participantData)
				+ "]";
	}

}
