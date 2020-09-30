package collection;

import java.util.ArrayList;
import java.util.List;

import items.Item;

public class libraryShelf {
	private List<Item> shelf1 = new ArrayList<>();
	
	public libraryShelf() {
		super();
	}
	
	public boolean addItem(Item item) {
		return this.shelf1.add(item);
	}
	public boolean removeItem(Item item) {
		return this.shelf1.remove(item);
	}
	public List<Item> getShelf(){
		return this.shelf1;
	}

	public void printShelf() {
		for(Item items: this.shelf1) {
			items.printItem();
			System.out.println("");
		}
	}
	
	

}
