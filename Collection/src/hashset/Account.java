package hashset;

public class Account {

	private String accountNumber;
	private String accountName;
	private float balance;
	
//	생성자는 그때 그때 상황에 맞춰서 제공하는 것이 기본
	public Account(){}
	public Account(String accountNumber, String accountName, float balance){
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public void deposite(float money){
		if( money <= 0 ){
			System.out.println("ERROR");
			return;
		}
		balance += money;
	}
	
	public void withdraw(int money){
		if( balance < money ){
			System.out.println("ERROR");
			return;
		}
		balance -= money;
	}
	
	public String toString(){
		return accountName + "님의 계좌의 계좌번호는 " + accountNumber + "이며, 잔고는 " + balance +"입니다.";
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		return this.accountNumber.hashCode();
//		return Integer.parseInt(accountNumber);
//		둘 중 하나를 사용하면 됨
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account){
			Account account = (Account)obj;
			if(this.accountNumber.equals(account.getAccountNumber())){
				return true;
			}
			else return false;
		}
		return false;
	}
	
	
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}

}
