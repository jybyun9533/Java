package self.bank;

public class BankService {

	public static final int MAX_CUSTOMERS = 100;
	public Customer[] customers;
	public int numberOfCustomers;

	private static BankService bank = new BankService();

	private BankService() {
		customers = new Customer[MAX_CUSTOMERS];
		numberOfCustomers = 0;
	}

	public static BankService getInstance() {
		return bank;
	}

	public void addCustomer(Customer cust) {
		// ����..�迭�� cust�� �߰��Ѵ�.
		if (numberOfCustomers == MAX_CUSTOMERS) {
			System.out.println("�� �̻� ȸ���� ������ �����ϴ�.");
		} else {
			customers[numberOfCustomers++] = cust;
		}
	}

	public Customer getCustomer(int ssn) {
		Customer cust = null;
		for (int i = 0; i < numberOfCustomers; i++) {
			if (customers[i].getSsn() == ssn) {
				cust = customers[i];
			}
		}

		return cust;
	}

	public void showAll() {
		if (numberOfCustomers == 0) {
			System.out.println("ȸ���� �ƹ��� �����ϴ�.");
			return;
		}

		for (int i = 0; i < numberOfCustomers; i++) {
			System.out.println(customers[i]);
		}
	}

}
