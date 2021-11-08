package TreeSetTask;
import CollectionAssignment.Account;
import CollectionAssignment.Application;
import CollectionAssignment.ApplicationDB;
import CollectionAssignment.ContactDetails;
import CollectionAssignment.KYCVerification;
import java.util.*;

public class TreeSetMain {
	
	public static void main(String[] args) {
		
		TreeSet<Account> tsAcc = new TreeSet();
		ApplicationDB app = new ApplicationDB();
		
		for(int i=0;i<2;i++)
		{
            Application data = new Application();
			
			System.out.println("Enter the detils of Account holder "+ (i+1));
			Account res = data.inputUserDetails();
			tsAcc.add(res);
		}
		System.out.println("------Sort based on city names-----\n\n");
		System.out.println(tsAcc);
		
		List<Account> list = new ArrayList();
		for  (Account t : tsAcc) {
			list.add(t);
			
		}
		
		Collections.sort(list, new SortByBalance());
		System.out.println("-------Sort based on balance-----\n\n");
		System.out.println(tsAcc);
		
		
		
	}

}
