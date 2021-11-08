package LambdaAssignment;

public class MyInterfaceImpl {
	
	public String getDetailUsingAnonymous() {
		MyInterface  obj=new MyInterface() {

			@Override
			public String test() {
				// TODO Auto-generated method stub
				return "Inside Anonymous MyTest Method ";
			}
			
		};
		String detail=obj.test();
		return detail;
	}
	public String getDetailUsingLamda() {
		MyInterface obj=()->{
			return "Inside Lamda MyTest Method";
			
		};
		String detail=obj.test();
		return detail;
		
	}

}
