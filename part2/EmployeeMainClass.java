package part2;
import java.util.*;

public class EmployeeMainClass 
{
	public static void main(String[] args)
	{
		Employee obj[]= new Employee[3];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<3;i++)
	    {
		    
		    String name ;
		    name = sc.next();
		    int salary;
		    salary = sc.nextInt();		
	    
		    obj[i] = new Employee(name,salary);
		    obj[i].setDesignation("ASE");
		    
	    }
		System.out.println("Employee details are :");
		for(int i=0;i<3;i++)
		{
			System.out.println(obj[i].toString());
		}
		
		System.out.println("Enter the name you want to search");
		String sname = sc.next();
		int resname = obj[2].searchByName(sname,obj);
		if(resname !=-1)
		{
			System.out.println("Name "+sname+" found ");
			System.out.println("Enter designation");
			String d = sc.next();
			obj[resname].setDesignation(d);
			
			System.out.println(obj[resname].toString());
		}
		else
		{
			System.out.println("Name "+ sname + " not found");
		}
		
		System.out.println("Enter the Id you want to search");
		int sid = sc.nextInt();
	
		    int resid = obj[2].searchById(sid,obj);
		    
		    if(resid!=-1)
		    {
		    	System.out.println(sid+" Found\n"+obj[resid].toString());
		    }
		    else
		    {
		    	System.out.println("Id "+ sid +" not found ");
		    }
		 
		System.out.println("Enter the Designation you want to search");
		String sdes = sc.next();
		
		int resdes = obj[2].searchByDesignation(sdes , obj);
		if(resdes!=-1)
		{
			System.out.println(sdes+" Found\n"+obj[resdes].toString());
		}
		else
		{
			System.out.println("Designation "+ sdes + " Not found");
		}

    }
}
