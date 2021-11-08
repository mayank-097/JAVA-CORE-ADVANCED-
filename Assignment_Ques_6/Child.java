package Assignment_Ques_6;

abstract class Child {
	
   private String name;
   private char gender;
   public int age;
   
   public Child(String cname , char cgender )
   {
	   this.name=cname;
	   this.gender=cgender;
   }
	
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
	public abstract void setAge(int age);
	public abstract void display();
	
}
