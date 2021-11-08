package excep;

public class InvalidCountryException extends Exception{
	
	String wrongcountry;
	
	public InvalidCountryException(String country)
	{
		super();
		this.wrongcountry=country;
	}

	@Override
	public String toString() {
		return "InvalidCountryException [wrongcountry=" + wrongcountry + "]";
	}
	

}
