package part2;

public class ArrayMainClass
{
	public static void main(String[] args) 
	{
			 // call methods of ArraysWork class
		short res;
		int arr1[],arr2[];
		ArraysWork obj = new ArraysWork();
		res = obj.getSum();
		System.out.println("Sum of the elements of the array is "+res);
		
		arr1=obj.getRepeatedValues();
		System.out.println("Repeated elements are ");
		for(int k=0;k<arr1.length;k++)
		{
			if(arr1[k]!=-1)
			{
			   System.out.print(arr1[k]+"\t");
		    }
		}
		arr2 = obj.getUniqueValues();
		System.out.println("\nUnique elements are ");
		for(int k=0;k<arr2.length;k++)
		{
			if(arr2[k]!=-1)
			{
				System.out.print(arr2[k]+"\t");
			}
			
		}
		
	}
}


