package StreamTask;
import java.util.List;
import java.util.stream.Collectors;

public class Account {
	
	int accountNumber;
	String accountHolderName;
	int balance;
	List<Policy> policies;
	ContactDetails contactDetails;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, String accountHolderName, int balance, List<Policy> policies,
			ContactDetails contactDetails) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.policies = policies;
		this.contactDetails = contactDetails;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + ", policies=" + policies + ", contactDetails=" + contactDetails + "]";
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public List<Policy> getPolicies() {
		return policies;
	}
	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	
//	4. filter accounts based on
//	 * following (display there accountnumber , name and phoneNumber through
//	 * separate bean class) 4.a ) state and policyname 4.b) state and premiumAmount
//	 * (higher than certain amount) and total balance
	
	public void printDetails()
	{
		List<Account> acc = MainRunner.insertData();
		
		System.out.println("\nDetails where state : UP and Policy : accidental ");
		
		List<Account> accounts = acc.stream().filter((a)->{
			if(a.contactDetails.getState().equals("UP"))
			{
				for (Policy pol : a.policies) {
					if(pol.getPolicyName().equals("accidental"))
					{
						return true;
					}
				}
			}
			return false;
			
		}).collect(Collectors.toList());
		
		
		
		for (Account account : accounts) {
			System.out.println("Account number :"+account.getAccountNumber()+" Account holder name :"+account.getAccountHolderName()+" Phone number :"+account.contactDetails.getPhoneNumber());
		}
		
		System.out.println("\n Details where State : UP , Premium Amount of policy greater than 30000 and Total Balace greater than 8000");
		
		List<Account> accoun = acc.stream().filter((a1)->{
			if(a1.contactDetails.getState().equals("UP"))
			{
				for (Policy pol2 : a1.policies) {
					if((pol2.getPremiumAmount()>30000)&&(a1.getBalance()>8000))
					{
						return true;
					}
				}
			}
			return false;
			
		}).collect(Collectors.toList());
		
		
		
		for (Account account : accoun) {
			System.out.println("Account number :"+account.getAccountNumber()+" Account holder name :"+account.getAccountHolderName()+" Phone number :"+account.contactDetails.getPhoneNumber());
		    
		}
		
	}

}
