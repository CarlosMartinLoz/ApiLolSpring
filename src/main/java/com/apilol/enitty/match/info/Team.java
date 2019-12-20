package com.apilol.enitty.match.info;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private List<Player> teamPlayers;
	private int teamId;
	
	public Team() {
		super();
		this.teamPlayers = new ArrayList();
	}
	public List<Player> getTeamPlayers() {
		return teamPlayers;
	}
	public void setTeamPlayer(Player player) {
		teamPlayers.add(player);
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	

	
	

}
