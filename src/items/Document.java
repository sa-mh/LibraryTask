package items;

public class Document extends Item{
private boolean redacted;
	
	public Document() {
		super();
	}
	public Document(String name, String Author, int pages, int published, int id, boolean checkedOut, boolean redacted) {
		super(name, Author, pages, published, id, checkedOut);
		this.redacted = redacted;
	}
	public boolean getRedacted() {
		return redacted;
	}
	public void setRedacted(boolean redacted) {
		this.redacted = redacted;
	}
	@Override
	public void printItem()
	{
		System.out.println("ID: "+ this.getID() + ". This document " + this.getName() + " was written by " + this.getAuthor() + ".");
		System.out.println("The document has " + this.getPages() + " pages and was published in " + this.getPublishDate());
		if(this.getRedacted()) {
			System.out.print(". The entire document is available.");
		}
		else {
			System.out.print(". Elements of the document are redacted.");
		}		
		if(this.getStatus()) {
			System.out.print(" The document is not currently available.");
		}
		else {
			System.out.print(" The document is available.");
		}
	}

}
