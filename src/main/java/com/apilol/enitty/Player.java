package com.apilol.enitty;

public class Player {
	
	private short profileIcon;
	private String name;
	private String puuid;
	private short level;
	private String accountId;
	private String id;
	
	

	public Player() {
		// TODO Auto-generated constructor stub
	}



	public Player(short profileIcon, String name, String puuid, short level, String accountId, String id) {
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



	@Override
	public String toString() {
		return "Player [profileIcon=" + profileIcon + ", name=" + name + ", puuid=" + puuid + ", level=" + level
				+ ", accountId=" + accountId + ", id=" + id + "]";
	}
	
	

}
