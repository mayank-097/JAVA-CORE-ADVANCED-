package OOPs;

public class App {
	
	private String appName;
	private int minimumMemory;
	public App()
	{
		super();
	}
	public App(String appName, int minimumMemory) {
		super();
		this.appName = appName;
		this.minimumMemory = minimumMemory;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public int getMinimumMemory() {
		return minimumMemory;
	}
	public void setMinimumMemory(int minimumMemory) {
		this.minimumMemory = minimumMemory;
	}
	@Override
	public String toString() {
		return "App [appName=" + appName + ", minimumMemory=" + minimumMemory + "]";
	}
	

}
