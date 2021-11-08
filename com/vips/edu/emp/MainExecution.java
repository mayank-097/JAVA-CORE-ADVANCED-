package com.vips.edu.emp;

public class MainExecution {
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		int length = service.getLength();		
		
		String city[] = service.getEmployeeCityCode();
		for(int i=0;i<length;i++)
		{
			System.out.println(codes[i]+" : "+city[i]);
			
		}

	
	}


}
