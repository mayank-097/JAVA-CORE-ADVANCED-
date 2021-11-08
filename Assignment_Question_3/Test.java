package Assignment_Question_3;

public class Test {
	public static void main(String[] args) {
		CurrAcc c = new CurrAcc();
		SavAcc s = new SavAcc();
		String  accounttype = "savings";
		
		c.customer_name = "1345";
		c.account_no = 12345;
		
		if(accounttype == "savings") {
			s.deposit(10000);
		}
		s.chk_bal();
	}

}
