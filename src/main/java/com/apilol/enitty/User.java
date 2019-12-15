package com.apilol.enitty;


import com.apilol.enitty.match.info.Matches;
import com.fasterxml.jackson.annotation.JsonAlias;

public class User {
	
	private short profileIcon;
	
	@JsonAlias({"summonerName", "name"})
	private String name;
	
	@JsonAlias({"currentAccountId", "puuid"})
	private String puuid;
	
	private short level;
	
	private String accountId;
	
	@JsonAlias({"summonerId", "id"})
	private String id;
	
	private Matches matches;
	
	public User() {
		
	}

	public User(short profileIcon, String name, String puuid, short level, String accountId, String id) {
		this.profileIcon = profileIcon;
		this.name = name;
		this.puuid = puuid;
		this.level = level;
		this.accountId = accountId;
		this.id = id;
	}



	public short getProfileIcon() {
		return profileIcon;
	}



	public void setProfileIcon(short profileIcon) {
		this.profileIcon = profileIcon;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPuuid() {
		return puuid;
	}



	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}



	public short getLevel() {
		return level;
	}



	public void setLevel(short level) {
		this.level = level;
	}



	public String getAccountId() {
		return accountId;
	}



	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}
	



	public Matches getMatches() {
		return matches;
	}



	public void setMatches(Matches matches) {
		this.matches = matches;
	}



	@Override
	public String toString() {
		return "Player [profileIcon=" + profileIcon + ", name=" + name + ", puuid=" + puuid + ", level=" + level
				+ ", accountId=" + accountId + ", id=" + id + ", matches=" + matches + "]";
	}




	
	

}
