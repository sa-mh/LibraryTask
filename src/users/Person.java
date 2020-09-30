package users;
import java.util.ArrayList;
import java.util.List;

public class Person {

	private String forename;
	private String surname;
	private int age;
	private int libraryID;
	private List<Integer> books = new ArrayList<>();
	
	public Person() {
		super();
	}
	public Person(String fName, String sName, int age, int ID) {
		this.forename = fName;
		this.surname = sName;
		this.age = age;
		this.libraryID = ID;
	}
	public void setFirstName(String fName) {
		this.forename = fName;
	}
	public String getFirstName() {
		return forename;
	}
	public void setLastName(String sName) {
		this.surname = sName;
	}
	public String getLastName() {
		return this.surname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setID(int ID) {
		this.libraryID = ID;
	}
	public int getID() {
		return libraryID;
	}
	public void checkOutBook(Integer bookID) {
		books.add(bookID);
	}
	public void checkInBook(Integer bookID) {			
		books.remove(bookID);
	}
	public List<Integer> getBooks(){
		return this.books;
	}
}
