package self.bank;

public class Address {
	// 필드선언
	private int zipCode;
	private String region, city;

	// 생성자
	public Address(int zipCode, String region, String city) {
		super();
		this.zipCode = zipCode;
		this.region = region;
		this.city = city;
	}

	/*
	 * public String getInfo() { return zipCode + ", " + region + ", " + city; }
	 */

	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", region=" + region + ", city=" + city + "]";
	}

}
