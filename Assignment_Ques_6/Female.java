package Assignment_Ques_6;

public class Female extends Child {
	
	public Female (String name)
	{
		super(name,'F');
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
