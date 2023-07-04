import java.util.*;
class Book{
	private int Id;
	private String Title,Author,Date;
	public Book(int a1,String a2,String a3,String a4) {
		Id=a1;
		Title=a2;
		Author=a3;
		Date=a4;
	}
	public String getTitle() {
		return Title;
	}
	public String getDate() {
		return Date;
	}
	public String getAuthor() {
		return Author;
	}
	public int getId() {
		return Id;
	}
}
public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String,HashMap<String,Book>> Lib=new HashMap<>();
		HashMap<String,Book> B1=new HashMap<>();
		Book b1=new Book(123,"Signals&System","KiranKumar","22/08/2019");
		Book b2=new Book(124,"Ac Signals","Viajaya Sri","23/08/2019");
		Book b3=new Book(125,"Dc Signals","Anil Kumar","24/08/2019");
		B1.put("2-1", b1);
		B1.put("2-2", b2);
		B1.put("2-3", b3);
		Lib.put("ECE", B1);
		HashMap<String,Book> B2=new HashMap<>();
		Book c1=new Book(126,"Java","kumari","25/08/2019");
		Book c2=new Book(127,"Python","Viajaya Lakshmi","26/08/2019");
		Book c3=new Book(128,"Cpp","Anil yadhav","27/08/2019");
		B2.put("2-1", c1);
		B2.put("2-2", c2);
		B2.put("2-3", c3);
		Lib.put("CSE", B2);
		HashMap<String,Book> B3=new HashMap<>();
		Book d1=new Book(129,"Current","Madhu","28/08/2019");
		Book d2=new Book(130,"Voltage","Lakshmi","29/08/2019");
		Book d3=new Book(131,"Power","yadhav","30/08/2019");
		B3.put("2-1", d1);
		B3.put("2-2", d2);
		B3.put("2-3", d3);
		Lib.put("EEE", B3);
		for(Map.Entry<String,HashMap<String,Book>> A1:Lib.entrySet()) {
			System.out.println(A1.getKey()+" Books\n");
			for(Map.Entry<String,Book> A2:A1.getValue().entrySet()) {
				System.out.println("     SEMESTER :"+A2.getKey()+"  BookName :"+A2.getValue().getTitle());
				System.out.println("              Authored by "+A2.getValue().getAuthor()+" on "+A2.getValue().getDate()+"\n");
			}
		}
		
	}

}
