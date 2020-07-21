package model;

public class Account {
	private Integer account;
	private double balance;
	private Integer owner;
	private String createdAt;
	public Account() {
		
	}
	public Account(int account, double balance, int owner, String createdAt) {
		
		this.account = account;
		this.balance = balance;
		this.owner = owner;
		this.createdAt = createdAt;
	}
	public long getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getOwner() {
		return owner;
	}
	public void setOwner(int owner) {
		this.owner = owner;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Account [account=" + account + ", balance=" + balance + ", owner=" + owner + ", createdAt=" + createdAt
				+ "]";
	}
	
	
	
}
