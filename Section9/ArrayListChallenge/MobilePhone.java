import java.util.ArrayList;

public class MobilePhone {
	
	private ArrayList<Contact> contacts;
	
	public MobilePhone() {
		contacts = new ArrayList<>();
	}
	
	public boolean addContact(String name, String number) {
		if (isEmpty(name) || isEmpty(number)) {
			System.out.println("The data is invalid");
		}
		if (indexOf(name) >= 0) {
			System.out.println("A contact with this name already exists");
		} else {
			contacts.add(new Contact(name, number));
			return true;
		}
		return false;
	}
	
	public boolean updateContact(String name, String newPhoneNumber) {
		if (isEmpty(name) || isEmpty(newPhoneNumber)) {
			System.out.println("The data is invalid");
		}
		int index = indexOf(name);
		if (index < 0) {
			System.out.println("The contact does not exists");
		} else {
			contacts.get(index).setPhoneNumber(newPhoneNumber);
			return true;
		}
		return false;
	}
	
	public boolean removeContact(String name) {
		if (isEmpty(name)) {
			System.out.println("The data is invalid");
		}
		int index = indexOf(name);
		if (index < 0) {
			System.out.println("There is not contact with that name");
		} else {
			contacts.remove(index);
			return true;
		}
		return false;
	}
	
	public void searchContact(String name) {
		if (isEmpty(name)) {
			System.out.println("The data is invalid");
		}
		int index = indexOf(name);
		if (index < 0) {
			System.out.println("There is not contact with that name");
		} else {
			System.out.println(contacts.get(index).toString());
		}
	}
	
	private int indexOf(String name) {
		for (int i = 0; i < contacts.size(); i++) {
			if (name.equals(contacts.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}
	
	private boolean isEmpty(String value) {
		return null == value || value.length() == 0;
	}
	
	public void printAllContacts() {
		System.out.println(" -	Contacts List:\n\n");
		for (Contact contact : contacts) {
			System.out.println(contact.toString());
		}
		System.out.println();
	}
}