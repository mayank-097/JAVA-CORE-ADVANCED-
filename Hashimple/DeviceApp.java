package Hashimple;
import java.util.*;

public class DeviceApp {
	
	public static void main(String[] args)
	{
		HashSet<Device> set = new HashSet();
		LinkedHashSet <Device> lhset = new LinkedHashSet();
		
		Device dev1 = new Device("MacBook pro",80000,4,"apple");
		Device dev2 = new Device("Hp 2001",40000,3,"hp");
		Device dev3 = new Device("Asus tuff",60000,4,"asus");
		Device dev4 = new Device("Hp 2001",40000,3,"hp");
		
		set.add(dev1);
		set.add(dev2);
		set.add(dev3);
		set.add(dev4);
		
		lhset.add(dev1);
		lhset.add(dev2);
		lhset.add(dev3);
		lhset.add(dev4);
		
		System.out.println("HashSet is implementing......");
		for(Device Db: set)
		{
			System.out.println(Db);
		}
		
		System.out.println("LinkedHashSet is implementing");
		for(Device Devc : lhset)
		{
			System.out.println(Devc);
		}
		
	}

}
