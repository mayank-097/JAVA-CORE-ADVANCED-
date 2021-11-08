package basic_loops;
import java.util.*;

public class pattern2 {

	  public static void main(String args[])                    //    *
	  {                                                         //   ***
	     for(int i=0;i<4;i++)                                   //  *****
	     {                                                      // *******
	        for(int j=0;j<7;j++)
	        {
	            if(i+j<3)
	            {
	            	System.out.print(" ");
	            }
	        	
	            else if((i+j)>=3&&(j-i<4))
	            {
	               System.out.print("*");
	            }
	        }
	        System.out.println("");
	     }
	   }

}
