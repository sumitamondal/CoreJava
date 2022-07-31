package oops;

	public class BOABank extends Bank {
		public int CreditCardNum;
		int AccountNum;
		public void CCBalance() {
		System.out.println("Inside CC Balance");
		
		this.CreditCardNum=1000;
		super.AccountNum=123456;
		this.AccountNum=7890;
		
		
		public void CloseAccount(int CCnumber) {
			System.out.println("Inside BOABank Close Account");
		}
		}
	}

