package part1;
import java.util.Scanner;
public class CalcSalary 
{
   private float hr_pay;
   private int hr_reg , hr_over;
   
   public  void getData (Scanner sc) 
   {
	   hr_pay=500;
	  
	   System.out.println("enter regular hours");
	   hr_reg = sc.nextInt();
	   System.out.println("enter over hours");
	   hr_over = sc.nextInt();
	   
   }
    public float calculateSalary()
    {
    	float weekly_sal;
    	weekly_sal=((hr_pay*hr_reg)+1.5f*(hr_pay*hr_over));
    	return weekly_sal;
    }
    public void displaySalary()
    {
    	System.out.println("weekly salary is "+calculateSalary());
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	CalcSalary cs = new CalcSalary();
    	cs.getData(sc);
    	cs.calculateSalary();
    	cs.displaySalary();
    	System.out.println(cs.hr_pay);
    	
    	
    	
    }
}
