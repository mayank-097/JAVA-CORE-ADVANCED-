package LambdaAssignment;

public interface Addressable {
	
	public String getCity();
	public String getState();
	default String getFullAddress()
	{
        
		return "Modinagar -"+" U.P";		
		
	}
	

}
