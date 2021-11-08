package Assignment_Question_2;

public class Worker {
	private String name;
	private double salaryrate;
	
	public Worker(String name, double salaryrate) {
		this.name = name;
		this.salaryrate = salaryrate;
	}
	public String getName() {
		return name;
	}
	public double getsalaryrate() {
		return salaryrate;
	}
	public double computePay(int hours) {
		if(hours<=40)
		return hours*salaryrate;
		else {
			int extra = hours-40;
		return (hours+extra)*40;
		}
	}
	public double computePay(int hours ,String salname) {
		return 40*salaryrate;
		}

}
