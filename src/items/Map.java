package items;

public class Map extends Item{
	
private boolean historical;
	
	public Map() {
		super();
	}
	public Map(String name, String Author, int pages, int published, int id, boolean checkedOut, boolean historic) {
		super(name, Author, pages, published, id, checkedOut);
		this.historical = historic;
	}
	public boolean getHistorical() {
		return historical;
	}
	public void setHistorical(boolean historic) {
		this.historical = historic;
	}
	@Override
	public void printItem()
	{
		System.out.println("ID: "+ this.getID() + ". This map " + this.getName() + "was made by " + this.getAuthor() + ".");
		System.out.println("The map has " + this.getPages() + " pages and was published in " + this.getPublishDate());
		if(this.getHistorical()) {
			System.out.print(". This is a historical map.");
		}
		else {
			System.out.print(". This is a modern map.");
		}		
		if(this.getStatus()) {
			System.out.print(" The document is not currently available.");
		}
		else {
			System.out.print(" The document is available.");
		}
	}
}
