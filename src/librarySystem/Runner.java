package librarySystem;

import collection.*;
import items.*;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		libraryShelf shelf = new libraryShelf();
		int ID;
		UniqueID idMaker = new UniqueID();
		ID = idMaker.uniqueID();
		Item book1 = new Book("Bible", "Jesus", 6000, 0, ID, false, 111111111);
		shelf.addItem(book1);
		ID = idMaker.uniqueID(shelf);
		Item map1 = new Map("Map of Salford", "Frank", 20, 2012, ID, false, false);
		shelf.addItem(map1);
		ID = idMaker.uniqueID(shelf);
		Item doc1 = new Document("Secret things", "The Queen", 30, 2021, ID, false, true);
		shelf.addItem(doc1);

		System.out.println(book1.getAuthor());
		System.out.println(book1.getID());
		System.out.println(map1.getID());
		System.out.println(doc1.getID());
		book1.setAuthor("Pope Frank");
		System.out.println(book1.getAuthor());
		shelf.removeItem(book1);
		
		

		
		/*

 ALL of the following: 	
- Check out item 
- Check in item 
- Add item 
- Remove item 
- Update item 
- Register person 
- Delete person 
- Update person

create a list of users like shelf, give them a list or array of book IDs
they have checked out to them

checkout method which will check if an item is checked out before attempting to
then check it out if it is in 
 */
	}

}
