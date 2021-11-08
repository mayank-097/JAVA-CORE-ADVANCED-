package Week2_Assignment;

public class WrongPhoneNumberException extends Exception {
	
	String WrongNumber;
	
	public WrongPhoneNumberException(String EnteredWrongNumber)
	{
		super();
		this.WrongNumber= EnteredWrongNumber;
		
	}

	@Override
	public String toString() {
		return "WrongPhoneNumberException [WrongNumber=" + WrongNumber + "]";
	}
	
	

}
