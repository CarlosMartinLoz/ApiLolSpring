package com.apilol.enitty.match.info;

import com.fasterxml.jackson.annotation.JsonProperty;
/*Informacion sobre el id del participante y a su vez contiene la informacion sobre el resto de los jugadores
 * Aunque parezca inutil importante para el parseo de la informacion recibida
 * */ 
 
public class Player {
	
	@JsonProperty("participantId")
	private int participantId;
	
	@JsonProperty("player")
	private PlayerData playerData;
	
	
	public PlayerData getPlayerData() {
		return playerData;
	}

	@Override
	public String toString() {
		return "Player [participantId=" + participantId + ", playerData=" + playerData + "]";
	}

	
	
	
	
	
	
	

}
