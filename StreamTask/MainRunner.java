package StreamTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainRunner {

	/*
	 * Requirement (to be done by stream API only through both approach anonymous
	 * inner class & lambda expression) 1. Update email on the basis of
	 * accountNumber 2. display Account based on maximum sumAssuredAmount 3. update
	 * premium amount of all medical policies by 10% 4. filter accounts based on
	 * following (display there accountnumber , name and phoneNumber through
	 * separate bean class) 4.a ) state and policyname 4.b) state and premiumAmount
	 * (higher than certain amount) and total balance
	 * 
	 */

	public static void main(String[] args) {
		
        Account ac = new Account();
		List<Account> account = insertData();

		updateEmail(account);
		maxSumAssuredAmount(account);
		updatePremiumAmount(account);
		ac.printDetails();
	}

	public static List<Account> insertData() {
		Policy p1 = new Policy(1, "medical", 10000, 5000);
		Policy p2 = new Policy(2, "vehicle", 20000, 10000);
		Policy p3 = new Policy(3, "accidental", 30000, 15000);
		Policy p4 = new Policy(4, "death", 40000, 20000);

		ContactDetails c1 = new ContactDetails("Ghaziabad", "UP", 1234567890, "mayank@gmail.com");
		ContactDetails c2 = new ContactDetails("Meerut", "UP", 1423323440, "goyal@gmail.com");
		ContactDetails c3 = new ContactDetails("Noida", "UP", 1212121212, "abhi@gmail.com");
		ContactDetails c4 = new ContactDetails("Ghaziabad", "UP", 1343434334, "shiv@gmail.com");

		List<Policy> policy1 = Arrays.asList(p1, p2);
		Account a1 = new Account(2323, "mayank", 10000, policy1, c1);
		List<Policy> policy2 = Arrays.asList( p1 ,p2, p3);
		Account a2 = new Account(4565, "goyal", 20000, policy2, c2);
		List<Policy> policy3 = Arrays.asList(p2, p4);
		Account a3 = new Account(9800, "abhi", 8000, policy3, c3);
		List<Policy> policy4 = Arrays.asList(p2, p3, p4);
		Account a4 = new Account(6869, "shiv", 10000, policy4, c4);

		List<Account> account = Arrays.asList(a1, a2, a3, a4);
		return account;
	}

	public static void updateEmail(List<Account> account) {

		List<Account> upAcc = account.stream().filter((m) -> m.getAccountNumber() == 2323).map((a) -> {
			a.contactDetails.setEmail("mayankbaliyan@gmail.com");
			return a;
		}).collect(Collectors.toList());

		System.out.println(upAcc);

	}

	public static void maxSumAssuredAmount(List<Account> account) {
		Comparator<Account> AmountComparator = (ac1, ac2) -> {
			List<Policy> pol1 = ac1.policies;
			List<Policy> pol2 = ac2.policies;
			
			int sum1 =0 , sum2=0;
			for (Policy pol : pol1) {
				sum1+=pol.getSumAssuredAmount();
			}
			for (Policy pol : pol2) {
				sum2+=pol.getSumAssuredAmount();
			}
			return sum1-sum2;
		};
		Stream<Account> stream = account.stream();
		Account res = stream.max(AmountComparator).get();
		System.out.println("\n");
		System.out.println(res);
		System.out.println("\n");

	}

	public static void updatePremiumAmount(List<Account> account) {
		
		account.stream().map((a1)->
		{
			List<Policy> po = a1.policies;
			for (Policy p : po) {
				if(p.getPolicyName().equals("medical"))
				{
					System.out.println("Previous amount :"+p.premiumAmount);
					p.setPremiumAmount((int)(p.getPremiumAmount()*1.10));
					System.out.println("Updated amount :"+p.premiumAmount);
					
				}
			}
			return a1;
			
		}).collect(Collectors.toList());
		
		System.out.println("\n");
		System.out.println(account);
	}


}
