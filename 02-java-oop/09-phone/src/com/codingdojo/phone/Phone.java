package com.codingdojo.phone;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	
	public abstract void displayInfo();
	
	public String getVersion() {
		return this.versionNumber;
	}
	public void setVersion(String version) {
		this.versionNumber = version;
	}
	
	public int getBatPercent() {
		return this.batteryPercentage;
	}
	public void setBatPercent(int battery) {
		this.batteryPercentage = battery;
	}
	
	public String getCarrier() {
		return this.carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	public String getRingTone() {
		return this.ringTone;
	}
	public void setRingTone(String ring) {
		this.ringTone = ring;
	}
}
