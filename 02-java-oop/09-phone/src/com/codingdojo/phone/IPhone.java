package com.codingdojo.phone;

public class IPhone extends Phone implements Ringable {
	
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
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
		return "Unlocking with Face ID";
	}
	
	@Override
	public void displayInfo() {
		String version = getVersion();
		String carrier = getCarrier();
		int battery = getBatPercent();
		String bat = String.valueOf(battery);
		System.out.println("iPhone " + version + " from " + carrier + " with %" + bat + " battery");
	}
}
