package StreamAPI;
import part2.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Random;


public class StreamDemo {
	
	public static void main(String[] args) {
		
//		StreamDemo1();
//		StreamDemo2();
//		StreamDemo3();
		StreamDemo4();
	}
	
	public static void StreamDemo1()
	{
		Stream<Integer> stream1 = Stream.of(1,27,4,76,98,45);
		Stream<Integer> stream2 = Stream.of(1,27,4,76,98,45);
		Integer y = stream2.max((o1,o2)-> o1.compareTo(o2)).get();
		Integer x = stream1.min((o1,o2)-> o1.compareTo(o2)).get();
		System.out.println("min is "+x);
		System.out.println("max is "+y);
	}
	
	public static void StreamDemo2()
	{
		Employee e1 = new Employee("Aman",45000);
		Employee e2 = new Employee("Mohan",15000);
		Employee e3 = new Employee("Rohan",55000);
		Employee e4 = new Employee("Shiv",5000);
		
		Comparator<Employee> EmpComparator = (emp1,emp2)->{
			return emp1.getSalary() - emp2.getSalary();
		};
		
		Employee e = Stream.of(e1,e2,e3,e4).min(EmpComparator).get();
		System.out.println(e);
		
	}
	
	public static void StreamDemo3()
	{
		Employee e1 = new Employee("Aman",3000);
		Employee e2 = new Employee("Mohan",13000);
		Employee e3 = new Employee("Rohan",43000);
		Employee e4 = new Employee("Shiv",35000);
		
		List<Employee> list2 = new ArrayList();
		
		list2 = Stream.of(e1,e2,e3,e4).filter((emp1)-> ((emp1.getSalary()>10000)&&(emp1.getSalary()<20000))).collect(Collectors.toList());
		
		System.out.println(list2);
	}
	
	public static void StreamDemo4()
	{
		Employee e1 = new Employee("Aman",3000);
		Employee e2 = new Employee("Mohan",13000);
		Employee e3 = new Employee("Rohan",93000);
		Employee e4 = new Employee("Shiv",35000);
		
		
		List<String> list =  Arrays.asList(e1,e2,e3,e4).stream().
				map(
						new Function<Employee, Employee>() {

							@Override
							public Employee apply(Employee t) {
								t.setSalary((int)(t.getSalary()*1.20));
								return t;
							}
						
							
						}).
				filter((e)->e.getSalary()<100000).
				map((e)->{
					e.setId(e.getId()+new Random().nextInt(400));
					return e.getName();
				}).collect(Collectors.toList());
		
		System.out.println(list);
	}

}
