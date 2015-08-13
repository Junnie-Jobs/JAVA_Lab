package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AccountManagerArrayList {

	public ArrayList<Account> accounts;
	
	public AccountManagerArrayList(){
		this(10);
	}
	
	public AccountManagerArrayList(int size){
		accounts = new ArrayList<Account>(size);
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.add(account);
	}
	
	public void setDeposite(String accountNumber, float money){
		
//		for(int index=0; index<accounts.size(); index++){
//			Account account = accounts.get(index);
//			String tempNumber = account.getAccountNumber();
//			
//			if( accountNumber == tempNumber){
//				account.deposite(money);
//				return;
//			}
//		}		
		
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
		
//		for(int index=0; index<accounts.size(); index++){
//			Account account = accounts.get(index);
//			System.out.println(account);
//		}
		
	}
}
