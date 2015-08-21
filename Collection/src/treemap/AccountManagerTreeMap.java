package treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class AccountManagerTreeMap {

	public TreeMap<AccountNumber, Account> accounts;
	
	public AccountManagerTreeMap(){
		this(10);
	}
	
	public AccountManagerTreeMap(int size){
		accounts = new TreeMap<AccountNumber, Account>();
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.put(new AccountNumber(accountNumber), account);
	}
	
	public void setDeposite(String accountNumber, float money){
		
		AccountNumber accNum = new AccountNumber(accountNumber);
		
		if(accounts.containsKey(accNum)){
			Account account = accounts.get(accNum);
			account.deposite(money);
			return;
		};
		
		System.out.println("There is no account");
	}
	
	public void displayAll(){
		
		Iterator<AccountNumber> ir = accounts.keySet().iterator();
		
		while(ir.hasNext()){
			AccountNumber accountNum = ir.next();
			System.out.println(accountNum);
			System.out.println(accounts.get(accountNum));
		}
	}
}
