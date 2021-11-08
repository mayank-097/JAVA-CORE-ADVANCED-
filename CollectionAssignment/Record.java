package CollectionAssignment;
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class Record {
	
	public static void main(String[] args)
	{
		ApplicationDB main_user = new ApplicationDB();
		List<Account> list = new ArrayList<>();
		
		for(int i=0;i<3;i++)
		{
			Application data = new Application();
			
			System.out.println("Enter the detils of Account holder "+ (i+1));
			Account res = data.inputUserDetails();
			list.add(res);
			
		}
		
		for(Account details:list)
		{
			System.out.println(details);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the low range of balance");
		int low_range = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the high range of balance");
		int high_range = Integer.parseInt(sc.nextLine());
		
		Iterator<Account> itr = list.iterator();
		while(itr.hasNext())
		{
			Account temp = itr.next();
			if((temp.getBalance()>=low_range)&&(temp.getBalance()<=high_range))
			{
				System.out.println(temp);
			}
			
		}
		
		for(Account det:list)
		{
			KYCVerification ob = det.getKycdetails();
			if(ob.getPanNumber().equals("null"))
			{
				System.out.println("KYC Details are pending.....");
				System.out.println(det);
			}
		}
		
		System.out.println("Enter the city whose account you want to store in the file");
		String enteredcity = sc.nextLine();
		
		String filepath = "C:\\Users\\HP\\Desktop\\interlearning\\AccountDetails.txt";
		
		File file = new File(filepath);
		try(FileWriter fw = new FileWriter(file))
		{
			try(PrintWriter pw = new PrintWriter(fw,true))
			{
				for(Account deta:list)
				{
					ContactDetails object = deta.getContactDetails();
					if(object.getCityName().equals(enteredcity))
					{
					     pw.append(String.valueOf(deta.getAccountNumber()));
					     pw.append("-");
					     pw.append(deta.getUsername());
					}
					
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
