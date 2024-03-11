import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public static void main(String[] args) {
		mainWindow();
	}
	
	static void mainWindow() {
		//clear screen
		while (true) {
			refreshScreen();
			System.out.flush();
			
			System.out.println("Main Window:\n=============");
			System.out.println("Choose one of the following options");
			System.out.println("(1) Add a new contact");
			System.out.println("(2) Search for contact");
			System.out.println("(3) Display all contacts");
			System.out.println("(4) Quit");
			System.out.print("Enter Your Choice: ");
			
			int input = scan.nextInt();
			
			while (!(input == 1 || input == 2 || input == 3 || input == 4)) {
				System.out.println("Enter Your Choice:");
				input = scan.nextInt();
			}
			
			switch (input) {
			case 1:
				addNewContactWindow();
				break;
			case 2:
				searchForContactWindow();
				break;
			case 3:
				displayAllContactsWindow();
				break;
			case 4:
				scan.close();
				System.exit(0);
				break;
			}
		}
		
	}
	
	static void addNewContactWindow() {
		//clear the screen
		refreshScreen();
		System.out.flush();
		
		//create a new contact
		Contact c = new Contact();
		
		//set contact info
		System.out.println("Main Window --> Add a new contact window: (Enter the following information)");
		System.out.println("===========================================================================");
		
		scan.nextLine();
		System.out.print("Name:");
		c.setName(scan.nextLine());
		System.out.print("Email:");
		c.setEmail(scan.nextLine());
		System.out.print("Phone:");
		c.setPhone(scan.nextLine());
		System.out.print("Notes:");
		c.setNotes(scan.nextLine());
		
		System.out.println("Saved successfully... Press Enter to go back to the Main Window");
		scan.nextLine();
		contacts.add(c);
		
		//mainWindow();

	}
	
	static void searchForContactWindow() {
		refreshScreen();
		
		System.out.println("Main Window --> Search for contact window: (Choose one of the following options)");
		System.out.println("===========================================================================");
		System.out.println("(1) Seach by name");
		System.out.println("(2) Search by email");
		System.out.println("(3) Search by phone");
		
		System.out.print("\nEnter Your Choice:");
		
		int input = scan.nextInt();
		
		while (!(input == 1 || input == 2 || input == 3)) {
			System.out.print("Enter Your Choice:");
			input = scan.nextInt();
		}
		
		switch (input) {
		case 1:
			searchByNameWindow();
			break;
		case 2:
			searchByEmailWindow();
			break;
		case 3:
			searchByPhoneWindow();
			break;
		}
	}
	
	static void searchByNameWindow() {
		refreshScreen();
		
		System.out.println("Main Window --> Search for contact window --> Search by Name");
		System.out.println("===========================================================================");
		
		//flush the buffer
		scan.nextLine();
		System.out.print("(1) Enter Name: ");
		//name to search for
		String nm = scan.nextLine();
		
		//create ArrayList of all contacts with this name as a substring
		ArrayList<Contact> subList = new ArrayList<Contact>();
		
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().contains(nm)) {
				subList.add(contacts.get(i));
			}
		}
		
		displayTheseContacts(subList);
		
		System.out.println("\nChoose one of these options: ");
		System.out.println("(1) To delete a contact");
		System.out.println("(2) Back to Main Window");
		System.out.print("\nEnter Your Choice: ");
		
		int input = scan.nextInt();
		
		while (!(input == 1 || input == 2)) {
			System.out.print("Enter Your Choice:");
			input = scan.nextInt();
		}
		
		switch (input) {
		case 1:
			refreshScreen();
			System.out.println("Main Window --> Search for contact window --> Search by Name --> Delete Contact");
			deleteContactWindow();
			break;
		case 2:
			//mainWindow();
			break;
		}
	}

	static void searchByEmailWindow() {
		refreshScreen();
		
		System.out.println("Main Window --> Search for contact window --> Search by Email");
		System.out.println("===========================================================================");
		
		//flush the buffer
		scan.nextLine();
		System.out.print("(1) Enter Email: ");
		//name to search for
		String em = scan.nextLine();
		
		//create ArrayList of all contacts with this name as a substring
		ArrayList<Contact> subList = new ArrayList<Contact>();
		
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getEmail().contains(em)) {
				subList.add(contacts.get(i));
			}
		}
		
		//display the search results
		displayTheseContacts(subList);
		
		System.out.println("\nChoose one of these options: ");
		System.out.println("(1) To delete a contact");
		System.out.println("(2) Back to Main Window");
		System.out.print("\nEnter Your Choice: ");
		
		//decide where to go
		int input = scan.nextInt();
		
		while (!(input == 1 || input == 2)) {
			System.out.print("Enter Your Choice:");
			input = scan.nextInt();
		}
		
		switch (input) {
		case 1:
			refreshScreen();
			System.out.println("Main Window --> Search for contact window --> Search by Email --> Delete Contact");
			deleteContactWindow();
			break;
		case 2:
			//mainWindow();
			break;
		}
	}
	
	static void searchByPhoneWindow() {
		refreshScreen();
		
		System.out.println("Main Window --> Search for contact window --> Search by Phone");
		System.out.println("===========================================================================");
		
		//flush the buffer
		scan.nextLine();
		System.out.print("(1) Enter Phone: ");
		//name to search for
		String pn = scan.nextLine();
		
		//create ArrayList of all contacts with this name as a substring
		ArrayList<Contact> subList = new ArrayList<Contact>();
		
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getPhone().contains(pn)) {
				subList.add(contacts.get(i));
			}
		}
		
		displayTheseContacts(subList);
		
		//display the search results
		displayTheseContacts(subList);
				
		System.out.println("\nChoose one of these options: ");
		System.out.println("(1) To delete a contact");
		System.out.println("(2) Back to Main Window");
		System.out.print("\nEnter Your Choice: ");
				
		//decide where to go
		int input = scan.nextInt();
		
		while (!(input == 1 || input == 2)) {
			System.out.print("Enter Your Choice:");
			input = scan.nextInt();
		}
		
		switch (input) {
		case 1:
			refreshScreen();
			System.out.println("Main Window --> Search for contact window --> Search by Phone --> Delete Contact");
			deleteContactWindow();
			break;
		case 2:
			//mainWindow();
			break;
		}
	}
	
	static void deleteContactWindow() {
		
		//System.out.println("Main Window --> Delete Contact");
		System.out.println("===========================================================================");
		
		System.out.print("Enter ID of Contact to Delete: ");
		int deleteId = scan.nextInt();
		int deleteIndex = -1;
		
		//search ArrayList for this contact and delete it
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getId() == deleteId) {
				deleteIndex = i;
			}
		}
		
		//delete if it exists, otherwise warn user
		if (deleteIndex == -1) {
			System.out.println("Cannot find this contact to delete... Press Enter to go back to the Main Window");
		} else {
			contacts.remove(deleteIndex);
			Contact.decreaseNumContacts();
			System.out.println("Deleted successfully... Press Enter to go back to the Main Window");
		}
		
		
		scan.nextLine();
		scan.nextLine();
		//mainWindow();
	}
	
	static void displayAllContactsWindow() {
		refreshScreen();
		
		displayTheseContacts(contacts);
		System.out.println("Press Enter to go back to the Main Window");
		scan.nextLine();
		scan.nextLine();
		
		//mainWindow();
	}
	
	static void displayTheseContacts(ArrayList<Contact> al) {
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println(String.format("%-2s %-10s %-30s %-20s %-20s","ID", "|Name", "|Email", "|Phone", "|Notes" ));
		System.out.println("----------------------------------------------------------------------------------------");
		
		al.sort(Comparator.naturalOrder());;
		
		Contact currentContact;
		//print all matches
		for (int i = 0; i < al.size(); i++) {
			currentContact = al.get(i);
			System.out.println(String.format("%-2d |%-9s |%-29s |%-19s |%-19s",currentContact.getId(), currentContact.getName(), currentContact.getEmail(), currentContact.getPhone(), currentContact.getNotes() ));
		}
		
		System.out.println("----------------------------------------------------------------------------------------");
	}
	
	static void refreshScreen() {
		for (int i = 0; i < 50; i++) {
			System.out.print("\n");
		}
	}
}
