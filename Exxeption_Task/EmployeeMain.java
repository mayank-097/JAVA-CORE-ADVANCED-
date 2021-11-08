package Exxeption_Task;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			try {
				System.out.println("Enter the Employee Id");
				int eid = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Hourly Wages of the Employee");
				float hwage = Float.parseFloat(sc.nextLine());
				Employee emp = new Employee(eid, hwage);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
