package Assignment_2_Ques;
import java.util.*;

public class ContactDetails {
	private String houseNumber;
	private String localityName;
	private String cityName;
	private String stateName;
	private String countryName;
	private long pincode;
	private long mobileNumber;
	private String emailId;
	
	Scanner sc = new Scanner(System.in);

	void setcontactdetails() {
		System.out.println("Enter the house no.:");
		houseNumber = sc.nextLine();
		System.out.println("Enter the localityName:");
		localityName = sc.nextLine();
		System.out.println("Enter the city:");
		cityName = sc.nextLine();
		System.out.println("Enter the state:");
		stateName = sc.nextLine();
		System.out.println("Enter the country:");
		countryName = sc.nextLine();
		System.out.println("Enter the pincode");
		pincode = Long.parseLong(sc.nextLine());
		System.out.println("Enter the mobile number:");
		mobileNumber = Long.parseLong(sc.nextLine());
		System.out.println("Enter the E-mail ID:");
		emailId = sc.nextLine();
	}
	void printUserContactDetails() {
		System.out.println(houseNumber);
		System.out.println(localityName);
		System.out.println(cityName);
		System.out.println(stateName);
		System.out.println(countryName);
		System.out.println(mobileNumber);
		System.out.println(emailId);
}

	void changeMobileNumber() {
		long newnum = Integer.parseInt(sc.nextLine());
		mobileNumber = newnum;
	}
	void changeEmailId() {
		String newmail = sc.nextLine();
		emailId = newmail;
	}

}
