package part1;
import java.util.Scanner;

public class Task1 {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int de;
		float ei,ia,ca=0;
		
		int yr = sc.nextInt();
		for(int j=0;j<yr;j++) 
		{
			de = sc.nextInt();
			ei = de + ca;
			ia = 0.09f* ei;
			ca = ei + ia;
		System.out.println(" ca of " + (j+1) + " year is "+ca);
		}
		
	}
	
	
}
