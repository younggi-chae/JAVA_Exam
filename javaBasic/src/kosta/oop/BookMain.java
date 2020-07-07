package kosta.oop;

public class BookMain {

	public static void main(String[] args) {
		
		Book book[] = {new Book("JAVA", 30000),
					   new Book("JSP", 25000),
					   new Book("Oracle", 15000)
		};
		
		book[0].discount();
		book[1].discount();
		book[2].discount();
		
		for(int i = 0; i < book.length; i++) {
			book[i].print();
		}
	}
}
