package part3;
import java.util.Scanner;

public class UserDevice {
	
	DeviceDB Dev = new DeviceDB();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		UserDevice object = new UserDevice();
		
		while(true)
		{
			System.out.println("1. Add New Device");
			System.out.println("2. Search Device based on ModelNumber");
			System.out.println("3. Print All Devices");
			System.out.println("4. Print Devices within Price Range");
			System.out.println("5. Filter Device based on Price Range and BrandName");
			System.out.println("   Apply avgRating filter on Filtered Devices");
			System.out.println("6. Exit");
			
			System.out.println("Enter you choice");
			int choice = Integer.parseInt(sc.nextLine());
			

		
			
			switch (choice) {
			case 1:
				object.addDevice();
				break;
				
			case 2:
				object.searchModelNumber();
				break;
				
			case 3:
				object.getAllDevices();
				break;
				
			case 4:
				object.getDevicesWithinRange();
				break;
				
			case 5:
				object.getDevicesByFilterRangeAndBrand();	
				break;
				
			case 6:
				System.exit(0);
				break;
				
			

			default:
				break;
			}
			
			

		}
		
		
		
	}
	public void addDevice()
	{
		System.out.println("Enter the device Name");
		String devname = sc.nextLine();
		System.out.println("Enter the Cost of the Device");
		int devcost = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Average Rating of the Device");
		int devrat = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Brandname of the Device");
		String devbname = sc.nextLine();
		Device devc = new Device(devname,devcost,devrat,devbname);
		boolean addres = Dev.insertNewDevice(devc);
		if(addres)
		{
			System.out.println("Device inserted successfully!");
			String resstr = devc.toString();
			System.out.println(resstr);
		}
		else
		{
			System.out.println("ERROR! Device not inserted!");
		}
			
	}
	
	public void searchModelNumber()
	{
		System.out.println("Enter the Model Number you want to search");
		String Modnum = sc.nextLine();
		Device Div = Dev.searchByModelNumber(Modnum);
		if(Div!=null)
		{
		    System.out.println(Modnum+" search successfully!");
			String resMod = Div.toString();
			System.out.println(resMod);
			
		}
		else
		{
			System.out.println(Modnum+" not found");
		}
	}
	
	public void getAllDevices()
	{
		Device resD[] = Dev.printDevices();
		for(Device device : resD)
		{
			System.out.println(device);
		}
	}
	
	public void getDevicesWithinRange()
	{
		System.out.println("Enter the start range ");
		int sRange = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the end range ");
		int eRange = Integer.parseInt(sc.nextLine());
		
		Device resRange[] = Dev.getDevicesWithinRange(sRange, eRange);
		for(Device device : resRange)
		{
			System.out.println(device);
		}
	}
	
	public void getDevicesByFilterRangeAndBrand()
	{
		System.out.println("Enter the start range ");
		int sRange = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the end range ");
		int eRange = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Brand Name");
		String bName = sc.nextLine();
		
		Device resFilter[] = Dev.getDeviceByFilterRangeAndBrand(sRange, eRange, bName);
		for(Device device : resFilter)
		{
			System.out.println(device);
		}
		
		System.out.println("Average rating of the filtered devices is");
		float resRating = Dev.getAvgRating(resFilter);
		System.out.println(resRating);
	}
	

}
