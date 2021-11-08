package part1;
import java.util.Scanner;

public class Employee {
	String name;
	char gender;
	double yearsofExp;
	String designation;
	double basicSalary;
	String status;
	
	public Employee (String n,char g) 
	{
		this.name=n;
		this.gender=g;
	
	}
	
	public void applyForLWP() 
	{
		status="Inactive";
		basicSalary=0;
	}
		
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public char getGender() 
	{
		return gender;
	}

	public void setGender(char gender) 
	{
		this.gender = gender;
	}

	public double getYearsofExp() 
	{
		return yearsofExp;
	}

	public void setYearsofExp(double yearsofExp) 
	{
		this.yearsofExp = yearsofExp;
	}

	public String getDesignation() 
	{
		
		return designation;
	}

	public void setDesignation() 
	{
		if( yearsofExp >=3) 
		{
		     this.designation="ITA";
		}
		else
		{
		     this.designation = "ASE";
		}
	}
	
	

	public double getBasicSalary()
	{
		return basicSalary;
	}

	public void setBasicSalary()
	{
		if(yearsofExp>=3) 
		{
		 	 this.basicSalary=15000;
		}
		else
		{
			 this.basicSalary = 10000;
		}
	}

	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public double promoteEmp() 
	{
		if(designation=="ASC") 
		{
		    return basicSalary;
		}
		else if(designation=="AST") 
		{
		    designation="ASC";
		    basicSalary+=basicSalary*0.1;
		}
		else if(designation=="ITA") 
		{
		    designation="AST";
		    basicSalary+=basicSalary*0.08;
		}
		else if(designation=="ASE") 
		{
		
			designation="ITA";
		    basicSalary+=basicSalary*0.05;
		}
		return basicSalary;
	}

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Employee E = new Employee(sc.next(),sc.next().charAt(0));
		System.out.println("Enter the YEARSOFEXP of the Employee");
		E.setYearsofExp(sc.nextDouble());	
	    E.setBasicSalary();
		E.setDesignation();
		E.setStatus("Active");
		System.out.println(E.promoteEmp());
		
		

		

	}

}
