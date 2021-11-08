package Week2_Assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class PhoneBookApp {

	Map<String, List<Long>> phoneBook = new HashMap<>();

	public static void main(String args[]) {
		// implement below requirement
		// if phone number do not contain 10 char , generate WrongPhoneNumberException
		// while inserting phone number
		// if phone number does not belongs to any user then generate
		// InvalidPhoneNumberException
		//
		PhoneBookApp pb = new PhoneBookApp();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {

			System.out.println("Enter username and phone number you want to insert");
			String entername = sc.nextLine();
			long enternumber = Long.parseLong(sc.nextLine());

			try {
				pb.insertPhoneNumber(entername, enternumber);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		System.out.println("Enter the user name whose phone number you want to update");
		String enteredusername = sc.nextLine();
		long invalidphone = Long.parseLong(sc.nextLine());
		try {
			pb.updatePhoneNumber(enteredusername, invalidphone);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Enter the phone number whose username you want to search");
		long searchphonenumber = Long.parseLong(sc.nextLine());
		String searchuser = pb.searchUser(searchphonenumber);
		System.out.println(searchuser + " - " + searchphonenumber);
		
		List<Long> list = new ArrayList();
		System.out.println("Enter the username whose phone number you want to search");
		String seachphonenum = sc.nextLine();
		list=pb.getPhoneNumbers(seachphonenum);
		System.out.println(list);
		
		
		System.out.println("Enter the username whose details you want to store in a file");
		String fileusername = sc.nextLine();
		pb.downloadPhoneNumbersInFile(fileusername);

	}

	public void insertPhoneNumber(String username, long phoneNumber) throws WrongPhoneNumberException {

		String PhoneNum = String.valueOf(phoneNumber);
		if (PhoneNum.length() < 10) {
			WrongPhoneNumberException e = new WrongPhoneNumberException(PhoneNum);
			throw e;

		}

		else {
			if (phoneBook.containsKey(username)) {
				ArrayList<Long> list = new ArrayList<>();
				list.add(phoneNumber);
				list.addAll(phoneBook.get(username));

				phoneBook.put(username, list);

			} else {
				ArrayList<Long> list = new ArrayList<>();
				list.add(phoneNumber);
				phoneBook.put(username, list);
			}
		}

		System.out.println(phoneBook);

	}

	public void updatePhoneNumber(String username, long newPhoneNumber) throws InvalidPhoneNumberException {

		if (!phoneBook.containsKey(username)) {
			InvalidPhoneNumberException e = new InvalidPhoneNumberException(username);
			throw e;
		} else {
			ArrayList<Long> list = new ArrayList<>();
			list.add(newPhoneNumber);
			phoneBook.put(username, list);
		}
		System.out.println(phoneBook);

	}

	public String searchUser(Long phoneNumber) {
		String username = null;

		
		for (Map.Entry<String, List<Long>> entry : phoneBook.entrySet()) {
			if (entry.getValue().contains(phoneNumber)) {
				username = entry.getKey();
			}
		}

		return username;
	}

	public List<Long> getPhoneNumbers(String username) {
		List<Long> phoneNumbers = new ArrayList();
		
		for(Map.Entry<String,List<Long>>  entry : phoneBook.entrySet() )
		{
			if(entry.getKey().equals(username))
			{
				phoneNumbers.addAll(entry.getValue());
			}
		
		}

		return phoneNumbers;
	}

	public void downloadPhoneNumbersInFile(String username) {
		// craete file for the phone numbers belong to the username
		// file name should be <username>_PhoneNumbers.txt
		
		String filepath ="C:\\Users\\HP\\Desktop\\interlearning\\"+username+".txt";
		
		File file = new File(filepath);
		
		try(FileWriter fw = new FileWriter(file))
		{
			try(PrintWriter pw = new PrintWriter(fw,true))
			{
				for(Map.Entry<String,List<Long>>  entry : phoneBook.entrySet() )
				{
					if(entry.getKey().equals(username))
					{
						pw.append(username);
						pw.append(" - ");
						List<Long> list = null;
						list = entry.getValue();
						for(long l : list)
						{
							pw.append(String.valueOf(l));
						}
					}
				}
			}
			
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
