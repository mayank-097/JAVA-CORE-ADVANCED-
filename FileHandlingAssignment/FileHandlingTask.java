package FileHandlingAssignment;

import java.io.*;
import java.util.Scanner;

public class FileHandlingTask {

	public static void main(String[] args) {
		String filepath = "C:\\Users\\HP\\Desktop\\interlearning\\FileHandlingExample.txt";
		File file = new File(filepath);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word you want to find the line of :");
		String word = sc.nextLine();
		int i = 1;

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = " ";

			while ((line = br.readLine())!= null) {
				
				String lineWords[] = line.split(" ");
				for(String words:lineWords)
				{
					if(words.equals(word))
					{
					System.out.println(words+" present in line "+i);
					}
				}
				i++;

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
