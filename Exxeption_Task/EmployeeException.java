package Exxeption_Task;

public class EmployeeException extends Exception {
	
	String str;
	
	public EmployeeException(String passedstr)
	{
		super();
		this.str=passedstr;
	}

	@Override
	public String toString() {
		return "EmployeeException [str=" + str + "]";
	}
	
	

}
