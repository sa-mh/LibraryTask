package librarySystem;

import items.Item;
import users.Person;


public class CheckInOut {
	
	public void checkOut(Person person, Item item) {
		
		if(item.getStatus()) {
			System.out.println("Sorry this has already been checked out.");
		}
		else {
			person.checkOutBook(item.getID());
			item.setStatus(true);
			System.out.println("Item " + item.getID() + " has been cheked out to " + person.getFirstName() + " " + person.getLastName());
		}
	}
	public void checkIn(Person person, Item item) {
		if(item.getStatus()) {	
			person.checkInBook(item.getID());
			item.setStatus(false);
			System.out.println("Item " + item.getID() + " has been cheked in by " + person.getFirstName() + " " + person.getLastName());
		}
		else {
			System.out.println("Sorry this has already been checked out.");
		}
	}

}
