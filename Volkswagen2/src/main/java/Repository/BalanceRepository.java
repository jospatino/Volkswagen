package Repository;

import java.util.ArrayList;
import java.util.List;

import model.Account;
import model.Transfer;

public class BalanceRepository {

	public List<Account> acounts = new ArrayList<Account>();
	List<Transfer> transfers = new ArrayList<Transfer>();
	
	public BalanceRepository() {
		Account a1 = new Account(123456789, 45450.00, 7437326, "2012-04-23T18:25:43.511Z");
		Account a2 = new Account(123456788, 45432.00, 7437328, "2012-04-23T18:25:43.511Z");
		Account a3 = new Account(123456787, 45342.00, 7437329, "2012-04-23T18:25:43.511Z");
		
		acounts.add(a1);
		acounts.add(a2);
		acounts.add(a3);
	}
	
	public Account getBalance(int account) {
		
		for (Account a: acounts) {
			if(a.getAccount()==account)
				return a;
		}
		
		return null;	
	}
	
	public void transferHistory(Transfer t) {
		transfers.add(t);
	}
	
	public List<Transfer> getTransferByAcount(int account){
		List<Transfer> transfers = new ArrayList<Transfer>();
		
		for(Transfer t: this.transfers) {
			if(t.getFromAcount() == account)
				transfers.add(t);
		}
		
		return transfers;
	}
	
	public List<Transfer> getRecievedTransferByAcount(int account){
		List<Transfer> transfers = new ArrayList<Transfer>();
		
		for(Transfer t: this.transfers) {
			if(t.getToAcount() == account)
				transfers.add(t);
		}
		
		return transfers;
	}
	
	public List<Transfer> getTransactionsByAcount(int account){
		List<Transfer> transfers = new ArrayList<Transfer>();
		
		for(Transfer t: this.transfers) {
			if(t.getToAcount() == account || t.getFromAcount() ==account)
				transfers.add(t);
		}
		
		return transfers;
	}
	
	public void transferMoney(Transfer t) {
		for (Account a: acounts) {
			if(a.getAccount()==t.getFromAcount() && a.getBalance()>-500)
				a.setBalance(a.getBalance()-t.getAmount());
		}//endFor
		for (Account a: acounts) {
			if(a.getAccount()==t.getToAcount())
				a.setBalance(a.getBalance()+t.getAmount());
		}//endFor
		
		transferHistory(t);
		
		
	}//endTransferMoney
}
