package Exxeption_Task;

public class InsufficientMemoryException extends Exception{
	
	String appname;
	
	public InsufficientMemoryException(String enterappname)
	{
		super();
		this.appname = enterappname;
	}

	@Override
	public String toString() {
		return "InsufficientMemoryException [appname=" + appname + "]";
	}

}
