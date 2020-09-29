package librarySystem;

import collection.libraryShelf;
import items.Item;


public class UniqueID {

		public int uniqueID()
		{
			return 1;
		}
		public int uniqueID(libraryShelf shelf)
		{
			int i = 1;
			for(Item shelfs: shelf.getShelf()) {
				if(shelfs.getID() >= i) {
					i++;
				}
			}
			return i;
		}
}
