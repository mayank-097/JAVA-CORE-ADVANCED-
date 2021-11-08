package part2;
import java.util.*;

public class ArraysWork 
{

	int arr[] = {15,19,6,3,74,84,62,100,20,38,415,3,74,16,15,9,650,67};
		
		
	public int[] getRepeatedValues()
	{
		// code to return arr[] containing only duplicate values, such as 15,3 etc
		for(int i=0;i<arr.length;i++)
		{
			int f=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					f=1;
				}
			}
			if(f==0)
			{
				arr[i]=-1;
			}
			
		}
		return arr;
	}
		
	public short getSum()
	{
		// code to return the total of all values;
		short sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
		
	public static int[] getUniqueValues()
	{
		// code to return arr[] containing all unique values only;
		ArraysWork ob = new ArraysWork();
		for(int i=0;i<ob.arr.length;i++)
		{
			for(int j=i+1;j<ob.arr.length;j++)
			{
				if(ob.arr[i]==ob.arr[j])
				{
					ob.arr[i]=-1;
					ob.arr[j]=-1;
				}
			}
			
		}
		return ob.arr;
	}
		
}


