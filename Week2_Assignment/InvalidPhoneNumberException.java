package Week2_Assignment;

public class InvalidPhoneNumberException extends Exception{
	
	String invalidusername;
	
	public InvalidPhoneNumberException(String enteredinvalidusername)
	{
		super();
		this.invalidusername=enteredinvalidusername;
	}

	@Override
	public String toString() {
		return "InvalidPhoneNumberException [invalidusername=" + invalidusername + "]";
	}
	
	

}
