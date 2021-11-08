package Assignment_2_Ques;
import java.util.*;

public class Account {
	private long accountNumber;
	private String username;
	private String password;
	private int balance;
	private float cashback;
	private int amounts;
	
	KYCVerification k = new KYCVerification();
	ContactDetails d = new ContactDetails();
	public void submituserdetails(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account number ");
		accountNumber = Long.parseLong(sc.nextLine());
		System.out.println("Enter the username ");
		username = sc.nextLine();
		System.out.println("Enter the password");
		password = sc.nextLine();
		System.out.println("Enter the balance");
		balance = Integer.parseInt(sc.nextLine());
		//1
		k.setuserkyc();
		d.setcontactdetails();
	}
	
	public void printUserAllDetails(){
	k.printUserKYCDetails();
	d.printUserContactDetails();
		
	}
	
	
	public void deposits(int amount) {
		amounts = amount;
	}
	public int getdeposits() {
		return amounts;
	}
	public void withdrawl(int amount){
		amounts = amounts - amount;
		cashback = 0.01f * amount;
		amounts += cashback;
	}
	public int printBalance() {
		return amounts;
	}

}
