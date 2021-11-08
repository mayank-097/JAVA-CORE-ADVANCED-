package Exxeption_Task;

import java.util.Scanner;

public class MobilePhone {
	public static int MAX_MEMORY_SPACE = 300;

	public static void main(String[] args) {
		MobilePhoneOS mobilephone = new MobilePhoneOS();
		App app[] = new App[5];
		MobilePhone mobile = new MobilePhone();
		try {
			app = mobilephone.getAllAppsInfo();
			mobile.appRunner(app);
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public static void appRunner(App app[]) throws InsufficientMemoryException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the App name which you want to Execute");
			String eName = sc.nextLine();

			int flag = 0;
			for (int i = 0; i < app.length; i++) {
				if (eName.equals(app[i].getAppName())) {
					if (app[i].getMinimumMemory() < MAX_MEMORY_SPACE) {
						flag = 1;
						System.out.println("App " + app[i].getAppName() + " can be executed successfully!");
						MAX_MEMORY_SPACE -= app[i].getMinimumMemory();
						break;

					} else {
						flag = 1;
						InsufficientMemoryException e = new InsufficientMemoryException(app[i].getAppName());
						throw e;
					}
				}
			}
			if (flag == 0) {
				System.out.println("App " + eName + " not found!");
			}
		}
	}

}
