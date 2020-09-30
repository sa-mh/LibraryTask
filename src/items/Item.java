package items;

public abstract class Item{
	
	private String name;
	private String author;
	private int pages;
	private int yearPublished;
	private int ID;
	private static int members = 1;
	private boolean checkedOut;
	
	//Implement an ID system in your Item class, utilising a static integer variable. 
	
	public Item() {
		super();
	}
	
	public Item(String name, String Author, int pages, int published, boolean checkedOut)
	{
		super();
		this.name = name;
		this.author = Author;
		this.pages = pages;
		this.yearPublished = published;
		this.ID = members;
		members++;
		this.checkedOut = checkedOut;
	}
	
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public int getPages() {
		return pages;
	}
	public int getPublishDate() {
		return yearPublished;
	}
	public int getID() {
		return ID;
	}
	public boolean getStatus() {
		return checkedOut;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void setPublishDate(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public void setStatus(boolean status) {
		this.checkedOut = status;
	}
	public abstract void printItem();

}
