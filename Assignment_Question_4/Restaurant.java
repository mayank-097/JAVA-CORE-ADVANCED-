package Assignment_Question_4;

public class Restaurant implements IRestaurant {
	
	Dish db[] = new Dish[3];
	
	public static int dishMenu[]= {1,2,3};
	
	public Dish getDish(int dId)
	{
		int flag=0;
		for(int i=0;i<dishMenu.length;i++)
		{
			if(dishMenu[i]==dId)
			{
				flag=1;
				break;
			}
		}
		
		
		
		if(flag==1)
		{
				if (dId == 1)
				{
					db[0]=new Dish();
					db[0].setDishId(dId);
					db[0].setDishName("Pizza");
					db[0].setDishPrice(250);
					db[0].setDishMakeTime(45);
					return db[0];
							
				}
				
				if(dId == 2)
				{
					db[1] = new Dish();
					db[1].setDishId(dId);
					db[1].setDishName("Burger");
					db[1].setDishPrice(100);
					db[1].setDishMakeTime(15);
					return db[1];
				}
				
				if(dId == 3)
				{
					db[2] = new Dish();
					db[2].setDishId(dId);
					db[2].setDishName("Egg-Roll");
					db[2].setDishPrice(150);
					db[2].setDishMakeTime(30);
					return db[2];
				}
			
		
		}
		System.out.println("Dish with DishId "+ dId+" not found in the Dish Menu");
		return null;
	}

}
