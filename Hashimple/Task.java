package Hashimple;
import java.util.*;

public class Task {
	
	public static void main(String[] args)
	{
		String str = "jbhsdhawknlaksjoidsabdskndihuo";
		int count=0;
		HashMap<Character,Integer> map = new HashMap();
		
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			
		}
		
		for (HashMap.Entry<Character,Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		
	}

}
