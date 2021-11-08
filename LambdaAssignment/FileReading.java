package LambdaAssignment;

import java.io.*;

public class FileReading {

	public static void main(String[] args) {
		
		String filepath = "C:\\Users\\HP\\Desktop\\FileOp";
		File file = new File(filepath);
		
		File[] a1 = file.listFiles(new FileFilter() {
			
			public boolean accept(File path)
			{
				return path.isFile();
			}
		});
		
		System.out.println("By anonymous class:-");
		for(File f1:a1)
		{
			if(f1.getName().endsWith(".java"))
			{
				System.out.println(f1.getName());
			}
		}
		
		File[] a2 = file.listFiles((f2)->f2.isFile());
		System.out.println("By lambda expression");
		for(File f3:a2)
		{
			if(f3.getName().endsWith(".java"))
			{
				System.out.println(f3.getName());
			}
		}

	}

}
