package edu.kh.inheritance.model.dto;

public class SmartPhone extends Phone{
	private String OperatingSystem;
	private int storageCapacity;
	
	public String getOperatingSystem() {
		return OperatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	
	
	public SmartPhone() {}
	public SmartPhone(String brand, String model, int year, int price,String operatingSystem, int storageCapacity) {
		super(brand,model,year,price);
		OperatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("Operating System: %s\nStorage Capacity: %dGB\n",OperatingSystem,storageCapacity);
	}
	
}
