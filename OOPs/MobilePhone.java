package OOPs;
import java.util.Scanner;

public class MobilePhone {
	
	public static final int MAX_MEMORY_SPACE = 300;
	
	public static void main(String[] args)
	{
		MobilephoneOS mobilephone = new MobilephoneOS();
		App app[] = new App[5];
		MobilePhone mobile = new MobilePhone();
		app = mobilephone.getAllAppsInfo();
		mobile.appRunner(app);
		
	}
	
	public static void appRunner(App app[])
	{
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the App name which you want to Execute");
		String eName = sc.nextLine();
		
		int flag =0;
		for(int i=0;i<app.length;i++)
		{
			if(eName.equals(app[i].getAppName()))
			{
				if(app[i].getMinimumMemory() < MAX_MEMORY_SPACE)
				{
					flag=1;
					System.out.println("App "+ app[i].getAppName()+" can be executed successfully!");
					
				}
				else
				{
					flag=1;
					System.out.println("App "+app[i].getAppName()+ " cannot be execute as Minimum Memory( "+app[i].getMinimumMemory()+" ) greater than Memory Space( "+ MAX_MEMORY_SPACE+" )");
				}
			}
		}
		if(flag==0)
		{
			System.out.println("App "+eName+" not found!");
		}
	}

}
