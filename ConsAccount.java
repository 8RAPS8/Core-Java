package OOP;

public class ConsAccount {
	
	private String number=null;
	private String accountType=null;
	private double balance=0.0;
	
	public ConsAccount(){
		System.out.println("This is default constructor");
	}
	public ConsAccount(String num,String act,double bal) {
		number=num;
		accountType=act;
		balance=bal;
		
	}
	public String getNumber() {
		return number;
	}
	public String getAccountType() {
		return accountType;
	}
	public double deposit() {
		double d=1000.00;
		balance=balance+d;
		return this.balance;
	}	
	public double withdrawal(){
		double w=500;
		balance=balance-w;
		return this.balance;
	}
	public double fundTransfer() {
		double ft=300;
		balance=balance-ft;
		return this.balance	;
	}
	public double billPayment() {
		double bp=200;
		balance=balance-bp;
		return this.balance;
	}
	
	public double getBalance() {
		return balance;
	}
	

}
