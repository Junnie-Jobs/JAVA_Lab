package treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class AccountManagerTreeSet {

	public TreeSet<Account> accounts;
	
	public AccountManagerTreeSet(){
		this(10);
	}
	
	public AccountManagerTreeSet(int size){
		accounts = new TreeSet<Account>(new Account());
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.add(account);
	}
	
	public void setDeposite(String accountNumber, float money){

		Iterator<Account> ir = accounts.iterator();
		
		while(ir.hasNext()){
			
			Account account = ir.next();
			String tempNumber = account.getAccountNumber();
			
			if( accountNumber == tempNumber){
				account.deposite(money);
				return;
			}
		}
		System.out.println("ERROR::There is no account");
	}
	
	public void displayAll(){
		
		Iterator<Account> ir = accounts.iterator();
		
		while(ir.hasNext()){
			Account account = ir.next();
			System.out.println(account);
		}

	}
}
