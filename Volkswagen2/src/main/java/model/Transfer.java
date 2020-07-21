package model;

public class Transfer {
	private int fromAcount;
	private int toAcount;
	private double amount;
	private String sentAt;
	
	
	public Transfer() {
		
	}
	public Transfer(int fromAcount, int toAcount, double amount) {
		
		this.fromAcount = fromAcount;
		this.toAcount = toAcount;
		this.amount = amount;
	}
	public int getFromAcount() {
		return fromAcount;
	}
	public void setFromAcount(int fromAcount) {
		this.fromAcount = fromAcount;
	}
	public int getToAcount() {
		return toAcount;
	}
	public void setToAcount(int toAcount) {
		this.toAcount = toAcount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getSentAt() {
		return sentAt;
	}
	public void setSentAt(String sentAt) {
		this.sentAt = sentAt;
	}
	@Override
	public String toString() {
		return "Transfer [fromAcount=" + fromAcount + ", toAcount=" + toAcount + ", amount=" + amount + "]";
	}
	
	
	
}
