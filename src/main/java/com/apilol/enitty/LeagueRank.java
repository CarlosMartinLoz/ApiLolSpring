	package com.apilol.enitty;

public class LeagueRank {
	private String queueType;
	private short wins;
	private short losses;
	private String tier;
	private String rank;

	public LeagueRank() {
	}

	public LeagueRank(String queueType, short wins, short loses, String tier, String rank) {
		this.queueType = queueType;
		this.wins = wins;
		this.losses = loses;
		this.tier = tier;
		this.rank = rank;
	}

	public String getQueueType() {
		return queueType;
	}

	public void setQueueType(String queueType) {
		this.queueType = queueType;
	}

	public short getWins() {
		return wins;
	}

	public void setWins(short wins) {
		this.wins = wins;
	}

	public short getLosses() {
		return losses;
	}

	public void setLosses(short loses) {
		this.losses = loses;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "LeagueRank [queueType=" + queueType + ", wins=" + wins + ", loses=" + losses + ", tier=" + tier
				+ ", rank=" + rank + "]";
	}
	
	

}
