public class Contact implements Comparable<Contact> {
	private int id;
	private static int numContacts;
	
	private String name;
	private String email;
	private String phone;
	private String notes;
	
	public Contact() {
		id = numContacts + 1;
		numContacts++;
	}
	
	public Contact(String n, String e, String p, String nt) {
		id = numContacts + 1;
		name = n;
		email = e;
		phone = p;
		notes = nt;
		numContacts++;
	}
	
	public static int getNumContacts() {
		return numContacts;
	}
	
	public static void resetNumContacts() {
		numContacts = 0;
	}
	
	public static void setNumContacts(int n) {
		numContacts = n;
	}
	
	public static void decreaseNumContacts( ) {
		numContacts--;
	}
	
	//GETTERS:
	
	public String getName() {
		return String.valueOf(name);
	}
	
	public String getEmail() {
		return String.valueOf(email);
	}
	
	public String getPhone() {
		return String.valueOf(phone);
	}
	
	public String getNotes() {
		return String.valueOf(notes);
	}
	
	public int getId() {
		return id;
	}
	
	
	//SETTERS:
	
	public void setName(String n) {
		name = String.valueOf(n);
	}
	
	public void setEmail(String e) {
		email = String.valueOf(e);
	}
	
	public void setPhone(String p) {
		phone = String.valueOf(p);
	}
	
	public void setNotes(String n) {
		notes = String.valueOf(n);
	}
	
	public int compareTo(Contact c) {
		return this.name.compareTo(c.name);
	}
}
