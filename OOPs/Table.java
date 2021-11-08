package OOPs;

public class Table {
	private int number;
	private int minimumrange;
	private int maximumrange;
	
	
	@Override
	public String toString() {
		return "Table [number=" + number + ", minimumrange=" + minimumrange + ", maximumrange=" + maximumrange + "]";
	}
	public Table(int number, int minimumrange, int maximumrange) {
		this.number = number;
		this.minimumrange = minimumrange;
		this.maximumrange = maximumrange;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getMinimumrange() {
		return minimumrange;
	}
	public void setMinimumrange(int minimumrange) {
		this.minimumrange = minimumrange;
	}
	public int getMaximumrange() {
		return maximumrange;
	}
	public void setMaximumrange(int maximumrange) {
		this.maximumrange = maximumrange;
	}
	
	

}
