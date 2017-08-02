import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String [] args) {
		boolean exit = false;
		MobilePhone mobilePhone = new MobilePhone();
		
		while (!exit) {
			printMenu();
			switch(readOption()) {
				case 1:
					mobilePhone.printAllContacts();
					break;
				case 2:
					System.out.print("\nContact Name: \t");
					String name = scanner.nextLine();
					System.out.print("Phone Number: \t");
					String phoneNumber = scanner.nextLine();
					mobilePhone.addContact(name, phoneNumber);
					break;
				case 3:
					System.out.print("\nSaved Contact Name: \t");	
					String savedName = scanner.nextLine();
					System.out.print("New Phone Number: \t");
					String newPhoneNumber = scanner.nextLine();
					mobilePhone.updateContact(savedName, newPhoneNumber);
					break;
				case 4:
					System.out.println("\nContact Name to remove: ");
					String contact = scanner.nextLine();
					mobilePhone.removeContact(contact);
					break;
				case 5:
					System.out.println("\nContact Name to search: ");
					String searchContact = scanner.nextLine();
					mobilePhone.searchContact(searchContact);
					break;	
				case 6:
					exit = true;
					break;
				default:
					System.out.println("Invalid Option, try again...");
			}	
		}
		
		
		mobilePhone.printAllContacts();
	}
	
	public static void printMenu() {
		System.out.println("\nMy Mobile Phone\n");
		System.out.println("1: Print Contacts");
		System.out.println("2: Add Contact");
		System.out.println("3: Update Contact");
		System.out.println("4: Remove Contact");
		System.out.println("5: Find Contact");
		System.out.println("6: Exit");
	}
	
	public static int readOption() {
		int option = 0;
		try { 
	    	option = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
	    	e.printStackTrace();
		} 
		return option;
	}
}