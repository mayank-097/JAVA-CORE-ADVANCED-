package ThreadTask;

public class Seat {
	
	private int seatNumber;
	private boolean status;
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seat(int seatNumber, boolean status) {
		super();
		this.seatNumber = seatNumber;
		this.status = status;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
