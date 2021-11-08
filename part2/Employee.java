package part2;
import java.util.Random;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String designation;
	
	public Employee(String name,int salary) {
		Random random = new Random();
		this.name = name;
		this.salary = salary;
        this.id = random.nextInt(100); // auto generated through random number
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Id = " + this.id + " Name = " + this.name + " Salary = " + this.salary+ " Designation = " + this.designation;
		
	}
	
	public int  searchById(int iden , Employee obj[])
	{
		
		for( int i=0;i<3;i++)
		{
			if(iden == obj[i].id)
			{
				return i;
			}
		}
		return -1;
	}
	
	public int searchByName(String str , Employee obj[])
	{
		
		for(int i=0;i<3;i++)
		{
			if(str.equals(obj[i].name))
			{
				return i;
			}
		}
		return -1;
	}
	
	public int searchByDesignation(String str , Employee obj[])
	{
		for(int i=0;i<3;i++)
		{
			if(str.equals(obj[i].designation))
			{
				return i;
			}
		}
		return -1;
	}
	

}
