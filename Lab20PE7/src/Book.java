
public abstract class Book {
	private String myName;
	public Book(String name) {
		myName = name;
	}
	public String getName() {
		return myName;
	}
	public abstract String opinion();
}
