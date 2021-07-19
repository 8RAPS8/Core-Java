package OOP;

public class Account {
		private String number=null;
		private String accountType=null;
		private double balance=2000.00;
		
		
		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public double getBalance() {
			return balance;
		}

		public  double deposit() {
			int d=1000;
			balance=balance+d;
			return this.balance;
			}
		
		public double withdrawal() {
				int w=500;
				balance=balance-w;
				return this.balance;
			}
		public double fundtransfer() {
				int ft=300;
				balance=balance-ft;
				return this.balance;
			}

			
			public double paybill() {
				int e=200;
				balance=balance-e;
					return this.balance;
			}


}
		
		
