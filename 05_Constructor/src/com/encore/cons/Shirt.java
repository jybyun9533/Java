package com.encore.cons;

public class Shirt {

	public String brandName;
	public double price;
	public boolean longSleeved;

	public Shirt(String brandName, double price, boolean longSleeved) {
		this.brandName = brandName;
		this.price = price;
		this.longSleeved = longSleeved;
	}

	public String getDetails() {
		return brandName + " " + price + " " + longSleeved;
	}

}
