package Week2_Assignment;

import java.util.Objects;

public class PhoneBook {
	
	private String username;
	private long phonenumber;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "PhoneBook [username=" + username + ", phonenumber=" + phonenumber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(phonenumber, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneBook other = (PhoneBook) obj;
		return phonenumber == other.phonenumber && Objects.equals(username, other.username);
	}
	
	

}
