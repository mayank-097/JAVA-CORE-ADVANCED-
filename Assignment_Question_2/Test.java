package Assignment_Question_2;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the worker");
		String ename = sc.nextLine();
		System.out.println("Enter the Salary Rate of the worker");
		double esrate = Double.parseDouble(sc.nextLine());
		Worker w = new Worker(ename,esrate);
		
		System.out.println("Enter the name of the worker");
		String ename1 = sc.nextLine();
		System.out.println("Enter the Salary Rate of the worker");
		double esrate1 = Double.parseDouble(sc.nextLine());
		SalariedWorker s = new SalariedWorker(ename1, esrate1);
		
		System.out.println("Enter the name of the worker");
		String ename2 = sc.nextLine();
		System.out.println("Enter the Salary Rate of the worker");
		double esrate2 = Double.parseDouble(sc.nextLine());
		HourlyWorker h = new HourlyWorker(ename2, esrate2);
		
		System.out.println("Enter the hours of works done by worker "+ename);
		System.out.println("Salary of the worker "+ ename +" is "+w.computePay(Integer.parseInt(sc.nextLine())));
		System.out.println("Enter the hours of work done by worker and name");
		System.out.println("Salary of the worker " +" is "+h.computePay(Integer.parseInt(sc.nextLine()),sc.nextLine()));
		System.out.println("Enter the hours of work done by worker");
		System.out.println("Salary of the worker "+ ename2 +" is "+s.computePay(Integer.parseInt(sc.nextLine())));
	}

}
