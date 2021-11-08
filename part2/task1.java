package part2;
import java.util.Scanner;

public class task1 {

	public static int takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		add obj = new add();
		int res = obj.addNum(num1,num2);
		return res;
		
	}
	public static void main(String[] args)
	{
		int result = takeInput();
		System.out.println("Result is "+result);
	}
}
