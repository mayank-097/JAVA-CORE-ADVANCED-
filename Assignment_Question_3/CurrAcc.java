package Assignment_Question_3;

public class CurrAcc extends Account{
	int deposit;
	int balance;
	int min = 1000;
	
	public void deposit(int deposit) {
	this.deposit = deposit;	
	balance += this.deposit;
	}
	public void chk_bal() {
		if(balance<min) {
			balance = balance - 120;
		}
		System.out.println(balance);
	}
	public void withdraw(int withdr) {
		if(balance>500) {
		balance = balance - withdr;
		System.out.println("amount wihdrawn" + withdr);
	}
	}

}
