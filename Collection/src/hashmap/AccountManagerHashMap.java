package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class AccountManagerHashMap {

	public HashMap<String, Account> accounts;
	
	public AccountManagerHashMap(){
		this(10);
	}
	
	public AccountManagerHashMap(int size){
		accounts = new HashMap<String, Account>(size);
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.put(accountNumber, account);
	}
	
	public void setDeposite(String accountNumber, float money){
		
		if(accounts.containsKey(accountNumber)){
			Account account = accounts.get(accountNumber);
			account.deposite(money);
			return;
		};
		
		System.out.println("There is no account");
	}
	
	public void displayAll(){
		
//		System.out.println(accounts);
		
		Iterator<String> ir = accounts.keySet().iterator();
		
		while(ir.hasNext()){
			String accountNum = ir.next();
			System.out.println(accountNum);
			System.out.println(accounts.get(accountNum));
		}
	}
}
