package CollectionAssignment;

import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable , Comparable<Account> {
	
	private long accountNumber;
	private String username;
	private String password;
	private int balance;
	private int cashback;
	KYCVerification kycdetails;
	ContactDetails contactDetails;
//	private int amounts;
	public Account() {
		
	}
	
	public Account(long accountNumber, String username, String password, int balance, int cashback) {
		
		this.accountNumber = accountNumber;
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.cashback = cashback;
	}

	
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCashback() {
		return cashback;
	}
	public void setCashback(int cashback) {
		this.cashback = cashback;
	}
	public KYCVerification getKycdetails() {
		return kycdetails;
	}
	public void setKycdetails(KYCVerification kycdetails) {
		this.kycdetails = kycdetails;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	public int deposit(int amount) {
		balance = balance + amount;
		
		return balance;
		}
	public int withdrawal(int amount) {
		if(amount<=(balance-5000))
		{
			int bal = balance-amount;
			balance = (int)(bal + (amount*0.01));
			cashback = (int)(amount*0.01);
			return balance;
		}
		
		return -1;
		
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", username=" + username + ", password=" + password
				+ ", balance=" + balance + ", cashback=" + cashback + ", kycdetails=" + kycdetails + ", contactDetails="
				+ contactDetails + "]";
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return (contactDetails.getCityName().compareTo(o.contactDetails.getCityName()));
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, balance, cashback, contactDetails, kycdetails, password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountNumber == other.accountNumber && balance == other.balance && cashback == other.cashback
				&& Objects.equals(contactDetails, other.contactDetails) && Objects.equals(kycdetails, other.kycdetails)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}

}
