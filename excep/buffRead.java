package excep;
import java.io.BufferedReader;
import java.io.FileReader;

public class buffRead {
	
	public static void main(String[] args)
	{
		try {
		BufferedReader in
		   = new BufferedReader(new FileReader("foo.in"));
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
}
}
