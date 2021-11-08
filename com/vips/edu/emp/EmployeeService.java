package com.vips.edu.emp;

public class EmployeeService {
	private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};
	
	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(0, 3);
		}
		
		return codes;
	}
	
	public String[] getEmployeeCityCode()
	{
		String city[] = new String[employees.length];
		int cCount = -1;
		for(String empcode : employees)
		{
			String str = empcode.substring(6,9);
			if(str.equals("011"))
			{
				city[++cCount] = "Delhi";
			}
			if(str.equals("022"))
			{
				city[++cCount] = "Mumbai";
			}
			if(str.equals("080"))
			{
				city[++cCount] = "Bangalore";
			}
			if(str.equals("020"))
			{
				city[++cCount] = "Pune";
			}
		}
		return city;
	}
	
	public int getLength()
	{
		return employees.length;
	}
		
	
	
}


