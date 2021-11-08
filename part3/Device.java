package part3;
import java.util.Random;

public class Device {
	
	private String deviceName;
	private String modelNumber;
	private int cost;
	private int avgRating;
	private String brandName;
		
	public Device(String deviceName, int cost, int avgRating,String brandName) {
		this.deviceName = deviceName;
		this.cost = cost;
		this.avgRating = avgRating;
	    this.brandName = brandName;
		}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String toString() {
		return "Device [deviceName=" + deviceName + ", modelNumber=" + modelNumber + ", cost=" + cost + ", avgRating="
				+ avgRating + ", brandName=" + brandName + "]";
	}
	
	public static String getRandomString()
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 3;
		
		for(int i=0;i<length;i++)
		{
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}
		
		String randomString = sb.toString();
		randomString+=random.nextInt(999);
		return randomString;
	}
	
	

}
