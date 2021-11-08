package Assignment_Question_5;
import java.util.Scanner;

public class UseCourse {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Department of the student");
		String depart = sc.nextLine();
		System.out.println("Enter the Course Number of the student ");
		int cno = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Credit of the student");
		int credit = Integer.parseInt(sc.nextLine());
		
		if((depart.equals("BIO")) ||(depart.equals("CHM"))||(depart.equals("CIS"))||(depart.equals("PHY")))
		{
			LabCourse Lc = new LabCourse(depart, cno, credit);
			Lc.display();
		}
		else
		{
			College_Course Cc = new College_Course(depart,cno,credit);
			Cc.display();
		}

	}

}
