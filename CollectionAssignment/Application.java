package CollectionAssignment;
import java.util.*;
import java.util.concurrent.SubmissionPublisher;

public class Application {
	
	ApplicationDB user = new ApplicationDB();
	Scanner sc = new Scanner(System.in);
    public Account inputUserDetails ()
	{	
		Application obj = new Application();
		 Account res = obj.submitUserDetails();
		 return res;
		
//		while(true)
//		{
//			System.out.println("1. Do deposit Operation");
//			System.out.println("2. Do Withdrawal Operation");
//			System.out.println("3. Print All Details");
//			System.out.println("4. Print User Contact Details");
//			System.out.println("5. Print User KYC Details");
//			System.out.println("6. Print Balance Details");
//			System.out.println("7. Change Mobile Number");
//			System.out.println("8. Change Email Id");
//			System.out.println("9. Exit");
//			
//			System.out.println("Enter your Choice : ");
//			int choice = obj.sc.nextInt();
//			
//			switch(choice)
//			{
//				case 1:
//					obj.doDepositOperation();
//					break;
//				
//				case 2:
//					obj.doWithdrawalOperation();
//					break;
//					
//				case 3:
//					obj.printUserAllDetails();
//					break;
//					
//				case 4:
//					obj.printUserContactDetails();
//					break;
//				
//				case 5:
//					obj.printUserKYCDocumentDetails();
//					break;
//				
//				case 6:
//					obj.printBalance();
//					break;
//				
//				case 7:
//					obj.changeMobileNumber();
//					break;
//					
//				case 8:
//					obj.changeEmailId();
//					break;
//				
//				case 9:
//					System.exit(0);
//				
//				default:
//					System.out.println("Invalid Choice");
//			}
//			
//		}
//		
	}
	
	public Account submitUserDetails()
	{	
		System.out.println("Enter Name of User : ");
		String name = sc.nextLine();
		
		System.out.println("Enter User Password : ");
		String password = sc.nextLine();
		
		System.out.println("Enter User PAN Number : ");
		String pan = sc.nextLine();
		
		System.out.println("Enter User Document Type : ");
		String doctype = sc.nextLine();
		
		System.out.println("Enter User Document Number : ");
		String docNumber = sc.nextLine();
		
		System.out.println("Enter User Aadhar Number : ");
		long aadhar = Long.parseLong(sc.nextLine());
		
		
		System.out.println("------------Enter User Address------------");
		
		System.out.println("Enter House Number : ");
		String houseNumber = sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Enter Locality Name : ");
		String locality = sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Enter City Name : ");
		String city = sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Enter State Name : ");
		String state = sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Enter Country Name : ");
		String country = sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Enter Pin Code : ");
		long pin = Long.parseLong(sc.nextLine());
		//sc.nextLine();
		
	/*	System.out.println("Enter Pin Code : ");
		long pin = sc.nextLong();
		sc.nextLine();*/
		
		System.out.println("Enter Mobile Number : ");
		long mobile = Long.parseLong(sc.nextLine());
		
		System.out.println("Enter Email id : ");
		String email = sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Enter Account Balance (Must be greater than or equal to 5000) : ");
		int balance = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Account Number : ");
		long accNo = Long.parseLong(sc.nextLine());
		
		Account acc = new Account();
		acc.setAccountNumber(accNo);
		acc.setBalance(balance);
		acc.setCashback(0);
		acc.setPassword(password);
		acc.setUsername(name);
		
		ContactDetails con = new ContactDetails();
		con.setCityName(city);
		con.setCountryName(country);
		con.setEmailId(email);
		con.setHouseNumber(houseNumber);
		con.setLocalityName(locality);
		con.setMobileNumber(mobile);
		con.setPincode(pin);
		con.setStateName(state);
		
		KYCVerification kyc = new KYCVerification();
		kyc.setAdharNumber(aadhar);
		kyc.setDocumentNumber(docNumber);
		kyc.setDocumentType(doctype);
		kyc.setPanNumber(pan);

		user.submitUser(acc, kyc, con);
		return user.getAccount();
	}
	
	public void doDepositOperation()
	{	
		System.out.println("Enter amount to deposited : ");
		int amount = sc.nextInt();
		System.out.println("Balance after Deposit is : "+ user.doDeposit(amount));
	}
	
	public void doWithdrawalOperation()
	{	
		System.out.println("Enter amount to withdraw : ");
		int amount = sc.nextInt();
		System.out.println("Balance after Withdrawal is : "+ user.doWithdrawal(amount));
	}
	
	public void printUserAllDetails()
	{
		user.printAllDetails();
	}
	
	public void printUserContactDetails()
	{
		user.printContactDetails();
	}
	
	public void printUserKYCDocumentDetails()
	{
		user.printUserKYCDocumentDetails();
	}
	
	public void printBalance()
	{
		user.printBalance();;
	}
	
	public void changeMobileNumber()
	{	
		System.out.println("Enter mobile number : ");
		long m = sc.nextLong();
		user.changeMobileNumber(m);
	}
	
	public void changeEmailId()
	{	
		sc.nextLine();
		System.out.println("Enter emal id : ");
		String email = sc.nextLine();
		user.changeEmail(email);
	}

}
