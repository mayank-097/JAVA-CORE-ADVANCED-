package ThreadTask;
import java.util.Scanner;

public class BookingAppUser implements Runnable {
	
	String users;
	
	BookingAppController controller = new BookingAppController();
	Scanner sc = new Scanner(System.in);
	
	public BookingAppUser( BookingAppController controller) {
		this.controller = controller;
		new Thread(this).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			System.out.println("Enter the name to book a seat");
		    users=sc.nextLine();
		    System.out.println("Enter the number of seats you want to seat");
		    int numberofseats = Integer.parseInt(sc.nextLine());
			boolean res = controller.bookSeat(users,numberofseats);
			if(res == false)
			{
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("User Thread"+e);
			}
		}
		
	}
	
	

}
