package items;

public class Book extends Item{
	
	private int ISBN;
	
	public Book() {
		super();
	}
	public Book(String name, String Author, int pages, int published, boolean checkedOut, int ISBN) {
		super(name, Author, pages, published, checkedOut);
		this.ISBN = ISBN;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int isbn) {
		this.ISBN = isbn;
	}
	@Override
	public void printItem()
	{
		System.out.println("ID: "+ this.getID() + ". This book " + this.getName() + " was written by " + this.getAuthor() + ".");
		System.out.println("The book has " + this.getPages() + " pages and was published in " + this.getPublishDate() + ".");
		System.out.print("The ISBN is " + this.getISBN() + ".");
		if(this.getStatus()) {
			System.out.print(" The book is not currently available.");
		}
		else {
			System.out.print(" The book is available.");
		}
		System.out.println("");
	}

}
