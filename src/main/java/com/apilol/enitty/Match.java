package com.apilol.enitty;

public class Match {

	private long id;
	private String lane;
	private String platformId;
	private long timestamp;
	private short queue;
	private byte season;
	
	
	
	public Match() {
	}
	
	public Match(long id, String lane, String platformId, long timestamp, short queue, byte season) {
		this.id = id;
		this.lane = lane;
		this.platformId = platformId;
		this.timestamp = timestamp;
		this.queue = queue;
		this.season = season;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
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
	
}
