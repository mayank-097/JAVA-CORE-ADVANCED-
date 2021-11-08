package Assignment_2_Ques;

import java.util.*;
//import java.util.concurrent.SubmissionPublisher;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1-submit user details");
			System.out.println("2-Deposit Amount");
			System.out.println("3-Withdraw Amount");
			System.out.println("4-Print User Details");
			System.out.println("5-Print User Conact Details");
			System.out.println("6-Print User KYC");
			System.out.println("7-Print Balance");
			System.out.println("8-Change Mobile number");
			System.out.println("9-Change Email Id");
			System.out.println("10-Exit");

			int n = Integer.parseInt(sc.nextLine());

			Account a = new Account();
			KYCVerification b = new KYCVerification();
			ContactDetails c = new ContactDetails();

			if (n == 1) {
				a.submituserdetails();
			}
			if (n == 2) {
				int d = sc.nextInt();
				a.deposits(d);
			}
			if (n == 3) {
				int w = sc.nextInt();
				if ((a.getdeposits() - w) >= 5000)
					a.withdrawl(w);
			}
			if (n == 4) {
				a.printUserAllDetails();
			}
			if (n == 5) {
				c.printUserContactDetails();
			}
			if (n == 6) {
				b.printUserKYCDetails();
			}
			if (n == 7) {
				System.out.println(a.printBalance());
			}
			if (n == 8) {
				c.changeMobileNumber();
			}
			if (n == 9) {
				c.changeEmailId();
			}
			if(n==10)
			{
				System.exit(0);
			}
		}
	}

}
