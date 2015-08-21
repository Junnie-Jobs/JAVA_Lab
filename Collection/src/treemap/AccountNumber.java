package treemap;

public class AccountNumber implements Comparable<AccountNumber>{
	
	String accountNumber;
	
	AccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	@Override
	public int compareTo(AccountNumber accNum) {
		return this.accountNumber.compareTo(accNum.accountNumber) * (-1);
	}

	@Override
	public String toString() {
		return this.accountNumber;
	}
}
