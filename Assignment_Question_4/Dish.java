package Assignment_Question_4;
import java.util.Scanner;

public class Dish {
	
	
	
	private int dishId;
	private String dishName;
	private int dishPrice;
	private int dishMakeTime;
	
	
	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", dishPrice=" + dishPrice + ", dishMakeTime="
				+ dishMakeTime + "]";
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dish Id you want to search");
		int dId = Integer.parseInt(sc.nextLine());
		
		Restaurant r = new Restaurant();
		Dish dish = r.getDish(dId);
		if(dish!=null)
		{
		    System.out.println(dish.toString());
		}
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}

	public int getDishMakeTime() {
		return dishMakeTime;
	}

	public void setDishMakeTime(int dishMakeTime) {
		this.dishMakeTime = dishMakeTime;
	}
		
		
	

}
