package Assignment_Question_5;

public class College_Course {
	String department;
	int courseNumber;
	int credit;
	int fee;
	
	public College_Course() {
		super();
	}
	public College_Course(String dept,int courseNo,int cred )
	{
		this.department=dept;
		this.courseNumber=courseNo;
		this.credit=cred;
		this.fee=120*cred;	
	}
	
	public void display()
	{
		System.out.println("Department is "+this.department+" Course number is "+this.courseNumber+" Credit is "+this.credit+" Fees is "+this.fee);
	}

}
