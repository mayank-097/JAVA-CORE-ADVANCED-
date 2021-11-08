package excep;

public class JobApplicationForm {
	
	public void submitForm(String name,String country,int age)throws InvalidCountryException
	{
		if(country.matches("India|Bhutan|Sri Lanka|Nepal"))
		{
			System.out.println(country+" Found! Application Submitted");
		}
			
		else
		{
			// raise exception
						InvalidCountryException e = new InvalidCountryException(country);
						throw e;
					}
		}
	
}
