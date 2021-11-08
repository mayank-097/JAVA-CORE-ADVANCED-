package com.vips.edu.emp;

public class EmailFilters {
    String emails[] = {

			"ramesh@gmail.com", "rakesh@outlook.com", "lokesh@linkedin.com", "mahesh@gmail.com", "ganesh@gmail.com",
			"rajesh@outlook.com" };

	public static void main(String[] args) 
	{
		EmailFilters Ef = new EmailFilters();
		int length = Ef.emails.length;
		
		int gmailcount = 0 , outlookcount = 0 , linkedincount=0;
		for( int i=0;i<length;i++)
		{
			if(Ef.emails[i].endsWith("gmail.com"))
			{
				gmailcount++;
			}
			else if (Ef.emails[i].endsWith("outlook.com"))
			{
				outlookcount++;
			}
			else if(Ef.emails[i].endsWith("linkedin.com"))
			{
				linkedincount++;
			}
		}
		System.out.println("gmail has "+ gmailcount+" users.");
		System.out.println("outlook has "+ outlookcount+" users.");
		System.out.println("linkedin has "+linkedincount+" users.");
		
	}


}
