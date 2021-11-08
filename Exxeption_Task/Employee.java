package Exxeption_Task;

public class Employee {
	
	int idnum;
	float hourlywages;
	
	public Employee(int inum,float hwages)throws EmployeeException
	{
		super();
		this.idnum = inum;
		this.hourlywages = hwages;
		
		if(hwages<6||hwages>50)
		{
			EmployeeException e = new EmployeeException(String.valueOf(idnum)+String.valueOf(hourlywages));
			throw e;
		}
		else
		{
			System.out.println("Employee has valid Hourly Wages");
		}
	}
	

}
