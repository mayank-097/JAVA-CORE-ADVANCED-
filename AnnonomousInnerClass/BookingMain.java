package AnnonomousInnerClass;

public class BookingMain {

	public static void main(String[] args) {

		OnlineBookingApp o1 = new OnlineBookingApp();

		boolean res = o1.login("A", "123", 0);
		if (res == true) {
			System.out.println("...Login Granted...");
		} else {
			System.out.println("...Login Failed...");
		}
		
        
		String result = o1.changeTheme("black");
		if (result != "Blue") {
			System.out.println("changed background colour is " + result);
		} else {
			System.out.println("background cannot be changed as you pass null default background is" + result);
		}

	}

}
