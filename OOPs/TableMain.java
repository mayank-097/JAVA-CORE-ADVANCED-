package OOPs;

import java.util.Scanner;

public class TableMain {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose table you want to print");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the starting range of the Table");
		int startrange = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the end range of the Table");
		int endrange = Integer.parseInt(sc.nextLine());
		
		Table table = new Table(num,startrange,endrange);
		for( int i=table.getMinimumrange();i<=table.getMaximumrange();i++)
		{
			System.out.println(table.getNumber()+" X "+i+" :- "+(table.getNumber()*i));
		}
	}

}
