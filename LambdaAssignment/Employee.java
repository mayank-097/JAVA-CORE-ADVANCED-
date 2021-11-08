package LambdaAssignment;

public class Employee {

	String city;
	String state;

	public Employee(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public String getAddress(String enteredtype) {
		Addressable Add = new Addressable() {

			@Override
			public String getCity() {
				// TODO Auto-generated method stub
				return city;
			}

			@Override
			public String getState() {
				// TODO Auto-generated method stub
				return state;
			}

		};
		if (enteredtype.equals("entered"))
			return Add.getCity() +" - "+ Add.getState();
		else
			return Add.getFullAddress();
	}

}
