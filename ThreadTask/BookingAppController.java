package ThreadTask;

import java.util.*;

import java.util.Random;

//Class handles the user traffic and book the seat
//1st use case :-  each user one seat
//2nd use case :-  each user max 6 seats

public class BookingAppController {

	Map<String, Integer> map = new HashMap();
	Map<Integer, String> data = new HashMap();

	Seat arr[];
	int remainingseat = 10;
	int filledseat = 0;

	public BookingAppController() {
		arr = new Seat[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = new Seat(i, false);
		}
	}

	public boolean bookSeat(String username, int selectedseat) {

		if (selectedseat > 6) {
			System.out.println("Cannot book more than 6 seats");
		}

		else {

			int count = selectedseat;

			while (count > 0) {
				Random random = new Random();
				int randomSeat = random.nextInt(10);

				if (!arr[randomSeat].isStatus()) {
					arr[randomSeat].setSeatNumber(randomSeat);
					arr[randomSeat].setStatus(true);
					filledseat++;
					remainingseat--;

					System.out.println("Seat booked successfully...");
					System.out.println("Name - "+username + " : " + "Seat number - "+arr[randomSeat].getSeatNumber());

					System.out.println("\nReamining seats :- " + remainingseat);
					count--;
					data.put(randomSeat, username);

				}
				if (remainingseat == 0) {
					System.out.println("All seats are booked....");
					System.out.println("Number of seats booked successfully :- " + (selectedseat - count));
					break;

				}

			}

			System.out.println("Seat status are");

			for (int i = 0; i < 10; i++) {
				if (data.containsKey(i)) {
					System.out.println("Seat " + i + " is booked by : " + data.get(i));
				} else {
					System.out.println("Seat " + i + " is unbooked");
				}
			}

			if (count < selectedseat) {
				map.put(username, selectedseat - count);
				System.out.println("\nSeats booked by " + username + " are : " + (selectedseat - count));
			}

		}
		if (remainingseat == 0) {
//			System.out.println("\nFinal status of Seats are :");
//			for (int i = 0; i < 10; i++) {
//				System.out.println("Seat " + i + " is booked by : " + data.get(i));
//				
//			}
			return false;
		}
		return true;

	}

}
