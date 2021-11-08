package Assignment_Question_5;

public class LabCourse extends College_Course{
	
	public LabCourse()
	{
		super();
	}
	
	public LabCourse(String Ldept,int LcourseNo , int Lcredit )
	{
		super.department=Ldept;
		super.courseNumber=LcourseNo;
		super.credit=Lcredit;
		super.fee=(120*Lcredit)+50;    //additional 50 for lab course.
	}

	@Override
	public void display() {
		super.display();
	}
	
	

}
