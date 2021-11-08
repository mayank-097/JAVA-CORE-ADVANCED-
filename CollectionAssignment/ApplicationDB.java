package CollectionAssignment;

public class ApplicationDB {
	
	private Account account;
	public void submitUser(Account obj, KYCVerification obj1, ContactDetails obj2)
	{	
		if(obj!=null && obj1!=null && obj2!=null)
		{	
			account = obj;
			account.setKycdetails(obj1);
			account.setContactDetails(obj2);
		}
	}
	
	public Account getAccount()
	{
		return account;
	}
	
	public int doDeposit(int amount)
	{	
		return account.deposit(amount);
	}
	public int doWithdrawal(int amount)
	{	
		return account.withdrawal(amount);
	}
	public void printAllDetails()
	{	
		System.out.println("User Details are : ");
		System.out.println(account);
		System.out.println(account.getKycdetails());
		System.out.println(account.getContactDetails());
	}
	public void printContactDetails()
	{	
		System.out.println("User Contact Details are : ");
		System.out.println(account.getContactDetails());
	}

	public void printUserKYCDocumentDetails()
	{	
		System.out.println("User KYC Details are : ");
		System.out.println(account.getKycdetails());
	}
	public void printBalance()
	{	
		System.out.print("User Current Balance is : ");
		System.out.print(account.getBalance());
	}
	public void changeMobileNumber(long number)
	{
		ContactDetails contact = account.getContactDetails();
		contact.setMobileNumber(number);
		System.out.println("Mobile Number Updated Successfully");
	}
	public void changeEmail(String email)
	{
		ContactDetails contact = account.getContactDetails();
		contact.setEmailId(email);
		System.out.println("Email Updated Successfully");
	}

}
