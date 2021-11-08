package Assignment_Question_3;

public class SavAcc extends Account{
	int deposit;
	int balance;
	double interest;
	
	public void deposit(int deposit) {
		this.deposit = deposit;	
		balance += this.deposit;
		}
	
	public void chk_bal() {
		System.out.println(balance);
	}
	public void withdraw(int withdr) {
		if(balance>500) {
		balance = balance - withdr;
		System.out.println("amount wihdrawn" + withdr);
	}
	}
	public void InterestCalculate() {
		interest = 0.03*balance;
		balance += interest;
	}

}
