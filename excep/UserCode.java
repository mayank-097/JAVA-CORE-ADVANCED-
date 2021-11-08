package excep;
import java.util.Scanner;

public class UserCode {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		JobApplicationForm form = new JobApplicationForm();
		try {
			System.out.println("Enter the name of the country");
			String Str = sc.nextLine();
			form.submitForm("Mayank", Str , 29);
		} catch (Exception e) {

			System.out.println(e);
		}

	}

}
