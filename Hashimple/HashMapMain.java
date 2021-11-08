package Hashimple;
import java.util.*;

public class HashMapMain {
	
	public static void main(String[] args)
	{
		 HashMap<Integer, Device> map = new HashMap<>();
			map.put(1, new Device("MacBook pro",80000,4,"apple"));
			map.put(2, new Device("Hp 2001",40000,4,"hp"));
			map.put(3, new Device("Asus tuff",60000,4,"asus"));
			map.put(null, new Device("Hp 2001",40000,4,"hp"));
			
			
			Iterator<Integer> itr = map.keySet().iterator();
			// extract key set from map key
			
			
			while(itr.hasNext())
			{
				System.out.println(map.get(itr.next()));
				
			}
			
			for (HashMap.Entry<Integer,Device> entry : map.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
			
			System.out.println(map);
	}


}
