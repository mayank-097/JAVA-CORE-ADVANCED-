package Assignment_Ques_6;
import java.util.Scanner;

public class UseChildren {
	
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		UseChildren ch = new UseChildren();
		while(true)
		{
			
		    System.out.println("1. Add MALE Child");
		    System.out.println("2. Add FEMALE Child");
	    	System.out.println("3. Exit");
		    int choice = Integer.parseInt(sc.nextLine());
		
		    switch(choice)
		    {
		        case 1 :
		        	ch.addMaleChild();
		        	break;
		        	
		        case 2 :
		        	ch.addFemaleChild();
		        	break;
		        
		        	
		        case 3:
		        	System.exit(0);
		        	
		    }
		}
	}
	
	public void addMaleChild()
	{
		System.out.println("Enter the name of the Male Child");
		String ename = sc.nextLine();
		System.out.println("Enter the age of the Male Child");
		int eage = Integer.parseInt(sc.nextLine());
		Male m = new Male(ename);
		m.setAge(eage);
		m.display();
		
	}
	
	
	public void addFemaleChild()
	{
		System.out.println("Enter the name of the Female Child");
		String ename = sc.nextLine();
		System.out.println("Enter the age of the Female Child");
		int eage = Integer.parseInt(sc.nextLine());
		Female f = new Female(ename);
		f.setAge(eage);
		f.display();
	}

}
