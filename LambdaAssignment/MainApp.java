package LambdaAssignment;

public class MainApp {
	
	public static void main(String[] args) {
		
		MyInterfaceImpl ob = new MyInterfaceImpl();
		System.out.println(ob.getDetailUsingAnonymous());
		System.out.println(ob.getDetailUsingLamda());
	}

}
