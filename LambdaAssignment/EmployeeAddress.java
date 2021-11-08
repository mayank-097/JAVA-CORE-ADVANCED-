package LambdaAssignment;
import java.util.Scanner;

public class EmployeeAddress{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee("Ghaziabad "," U.P");
		System.out.println("Enter default of entered");
		String type = sc.nextLine();
		String address = emp.getAddress(type);
		System.out.println(address);
		
		
	}

}
