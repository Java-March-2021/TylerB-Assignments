package com.codingdojo.phone;

public class Galaxy extends Phone implements Ringable{
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		String version = getVersion();
		String ringer = getRingTone();
		return version + " says " + ringer;
		
	}
	
	@Override
	public String unlock() {
		return "Unlocking with fingerprint";
	}
	
	@Override
	public void displayInfo() {
		String version = getVersion();
		String carrier = getCarrier();
		int battery = getBatPercent();
		String bat = String.valueOf(battery);
		System.out.println("Galaxy " + version + " from " + carrier + " with %" + bat + " battery");
	}
}
