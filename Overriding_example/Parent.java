package Overriding_example;

public class Parent {
	
	public void fun()
	{
		System.out.println("fun parent");
	}
	private void fun1() 
	{
		System.out.println("fun1 parent");
	}
	protected void fun2() 
	{
		System.out.println("fun2 parent");
	}
	final void fun3() 
	{
		System.out.println("fun3 parent");
	}
	static void fun4() 
	{
		System.out.println("fun4 parent");
	}

}
