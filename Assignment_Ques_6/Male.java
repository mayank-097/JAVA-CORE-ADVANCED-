package Assignment_Ques_6;

public class Male extends Child{
	
	public Male (String name)
	{
		super(name,'M');
		
	}

	@Override
	public void setAge(int age) {
		
		super.age = age;
	}

	@Override
	public void display() {
		
		System.out.println("Name of the chlid is "+super.getName()+" Gender of the child is "+ super.getGender()+ " Age of the child is "+super.getAge());;
	}

}
