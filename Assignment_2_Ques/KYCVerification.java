package Assignment_2_Ques;
import java.util.*;

public class KYCVerification 
{
	private String panNumber;
	private long adharNumber;
	private String documentType;
	private String documentNumber;
	
    Scanner sc = new Scanner(System.in);

	
	  void setuserkyc() 
	  { 
		  System.out.println("Enter the PAN number:");
		  panNumber = sc.nextLine();
		  System.out.println("Enter the Aadhar number:");
		  adharNumber = Long.parseLong(sc.nextLine());
		  System.out.println("Enter the document type:");
	      documentType = sc.nextLine();
	      System.out.println("Enter the document number:");
	      documentNumber = sc.nextLine(); 
      }
	 
	void printUserKYCDetails() {
		
		System.out.println("PAN number is : "+panNumber +
				"\nAadhar number is : " +adharNumber  + 
				"\nDocument type is : " +documentType +
				"\nDocument number is : " + documentNumber);
		}

}
