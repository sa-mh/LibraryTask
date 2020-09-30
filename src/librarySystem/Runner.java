package librarySystem;

import collection.*;
import items.*;
import users.Person;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		libraryShelf shelf = new libraryShelf();
		
		CheckInOut checkInOut = new CheckInOut();
		
		
		
		Item book1 = new Book("Bible", "Jesus", 6000, 0, false, 111111111);
		shelf.addItem(book1);
		
		Item map1 = new Map("Map of Salford", "Frank", 20, 2012, false, false);
		shelf.addItem(map1);
		
		Item doc1 = new Document("Secret things", "The Queen", 30, 2021, false, true);
		shelf.addItem(doc1);
		
		Person dave = new Person("Dave", "Smith", 30, 1);

		System.out.println(book1.getAuthor());
		book1.setAuthor("Pope Frank");
		System.out.println(book1.getAuthor());
		shelf.printShelf();
		System.out.println("");
		
		shelf.removeItem(book1);	
		System.out.println("");
		
		checkInOut.checkOut(dave, map1);
		shelf.printShelf();
		System.out.println("");
		
		checkInOut.checkIn(dave, map1);
		shelf.printShelf();
		System.out.println("");
	}

}
