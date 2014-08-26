import java.util.*;
public class AllRequests {
	private ArrayList requestList;
	
	public AllRequests() {
		requestList = new ArrayList();
	}
	
	public void allBooks() {
		for(int i=0;i<requestList.size();i++)
		{
			Book b=(Book)requestList.get(i);
			System.out.println(b.getName()+" -- "+b.opinion());
		}
	}
	
	public void addBook(Book b) {
		requestList.add(b);
	}
}
