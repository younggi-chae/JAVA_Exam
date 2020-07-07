package kosta.oop;

public class BookMain {

	static int total;
	
	public static void main(String[] args) {
		
		Book book[] = {new Book("JAVA", 30000),
					   new Book("JSP", 25000),
					   new Book("Oracle", 15000)
		};		
				
		for(int i = 0; i < book.length; i++) {
			book[i].discount();
			book[i].print();
			total += book[i].dcPrice;
		}
		System.out.println();
		System.out.println("총금액 : "+ total);
	}
}

