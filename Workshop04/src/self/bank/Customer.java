package self.bank;

/*
 * this Ű����
 * ::
 * 1. �ʵ��� �̸��� ������ �̸��� ������ �����ϱ� ���ؼ� �ʵ� �տ� ���δ�.
 * 2. ������ ���� this --- this(null,ssn, null);
 *    ���� Ŭ�������� �Ǵٸ� �����ڸ� ȣ��
 */
public class Customer {

	public static final String DEFAULT_NAME = "Encore";
	// public static final String DEFAULT_ADDR = "�����";

	private String name;
	private int ssn; // �ֹι�ȣ

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
