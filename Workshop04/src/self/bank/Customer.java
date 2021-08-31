package self.bank;

/*
 * this 키워드
 * ::
 * 1. 필드의 이름과 변수의 이름이 같을때 구분하기 위해서 필드 앞에 붙인다.
 * 2. 생성자 앞의 this --- this(null,ssn, null);
 *    같은 클래스에서 또다른 생성자를 호출
 */
public class Customer {

	public static final String DEFAULT_NAME = "Encore";
	// public static final String DEFAULT_ADDR = "서울시";

	private String name;
	private int ssn; // 주민번호

	private Account account;
	private Address address;

	public Customer(int ssn) {
		this(DEFAULT_NAME, ssn, null, null);
	}

	public Customer(String name, int ssn, Address address) {
		this(name, ssn, address, null);
	}

	public Customer(String name, int ssn, Account account, Address address) {
		this.name = name;
		this.ssn = ssn;
		this.account = account;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", ssn=" + ssn + ", account=" + account + ", address=" + address + "]";
	}

	/*
	 * public String getInfo() { return name+", " + address; }
	 */

} // class
