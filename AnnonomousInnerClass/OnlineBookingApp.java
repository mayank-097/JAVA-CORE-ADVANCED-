package AnnonomousInnerClass;
import java.util.*;

public class OnlineBookingApp {
	
	Map<String,String> userdetails = new HashMap();
	String theme = "Blue";

	public OnlineBookingApp()
	{
	   this.userdetails.put("A","123");
	   this.userdetails.put("B", "456");
	   this.userdetails.put("C", "486");
	   this.userdetails.put("D", "496");
	    
	}
	
	public boolean login(String username , String password , int pin)
	{
		SecurityCheck securitycheck = (String name , String pass , int p)->{
			
			if(userdetails.containsKey(name))
			{
				if(userdetails.get(username)==pass)
				{
				return name;
				}
				else
				{
					return "incoreect password";
				}
				
			}
			else
			{
				return null;
			}
		};
		
		String userName = securitycheck.validateUser(username, password, pin);
		if(userName!=null)
		{
			if(userName == "incorrect password")
			{
				return false;
			}
			else
			{
			return true;
			}
		}
		else
		{
			return false;
		}
	}
	
	
	public String changeTheme(String themeName)
	{
		Themeable changetheme = ( Theme)->{
		
			if(themeName!=null)
			{
				return themeName;
			}
			else
			{
				return "blue";
			}
		};
		
		String changedtheme = changetheme.changeBackground(themeName);
		return changedtheme;
	}
	
	public boolean loginUsingAnnonymous(String username , String password , int pin)
	{
		SecurityCheck securitycheck = new SecurityCheck() {
			
			public String validateUser(String name , String pass , int p)
			{
			
			if(userdetails.containsKey(name))
			{
				if(userdetails.get(username)==pass)
				{
				return name;
				}
				else
				{
					return "incoreect password";
				}
				
			}
			else
			{
				return null;
			}
			}
		};
			
		
		
		String userName = securitycheck.validateUser(username, password, pin);
		if(userName!=null)
		{
			if(userName == "incorrect password")
			{
				return false;
			}
			else
			{
			return true;
			}
		}
		else
		{
			return false;
		}
		
	}
	
	public String changeThemeUsingAnonymous(String theme)
	{
		Themeable th = new Themeable() {
		 public String changeBackground(String themeName)
			{
				if(themeName!=null)
				{
					return themeName;
				}
				else
				{
					return "blue";
				}
			}
			
		};
		
		String sname = th.changeBackground(theme);
		return sname;
		
	}

	


}
