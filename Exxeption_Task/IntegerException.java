package Exxeption_Task;
import java.util.Scanner;

public class IntegerException {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer");
		String enteredvlue = sc.nextLine();
		
		try
		{
			Integer.parseInt(enteredvlue);
			System.out.println("Entered value is an Integer");
		}
		catch(Exception e)
		{
			System.out.println("Entered value is not an Integer");
		}
		sc.close();
	}

}
