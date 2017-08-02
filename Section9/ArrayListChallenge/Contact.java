public class Contact{
	
	private String name;
	private String phoneNumber;
	
	public Contact() {
		
	}
	
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;	
	}
	
	@Override
	public String toString() {
		return this.name + "\t" + this.phoneNumber;
	}
}