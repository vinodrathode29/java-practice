
public class Account {
	private String accountNumber;
	private int balance;

	public Account(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account() {
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

}
