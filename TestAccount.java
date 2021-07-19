package OOP;

public class TestAccount {
	public static void main(String[] args) {
		Account a=new Account();
		a.setAccountType("Current");
		 System.out.println("Account type="+a.getAccountType());
		a.setNumber("1234567812345678");
		System.out.println("Account Number="+a.getNumber());
		System.out.println("Initial Balance="+a.getBalance());
		System.out.println("Balance after Deposit="+a.deposit());
		System.out.println("Balance after withdrawal="+a.withdrawal());
		System.out.println("Balance after fund transfer="+a.fundtransfer());
		System.out.println("Balance after pay bill="+a.paybill());
	}
	
}
