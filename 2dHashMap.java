package Collections;

import java.util.HashMap;
import java.util.Map;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, HashMap<Integer, Books>> library = new HashMap<>();
		Books b1 = new Books(1, "kira", "11");
		Books b2 = new Books(2, "kiran", "12");
		Books b3 = new Books(3, "kiram", "13");
		HashMap<Integer, Books> b11 = new HashMap<>();
		b11.put(1, b1);
		b11.put(2, b2);
		b11.put(3, b3);
		library.put("CSE", b11);
		library.put("ECE", b11);
		library.put("EEE", b11);
		for (Map.Entry<String, HashMap<Integer, Books>> ee : library.entrySet()) {
			System.out.println(ee.getKey());
			for (Map.Entry<Integer, Books> e1 : ee.getValue().entrySet()) {
				System.out.println(e1.getKey() + " " + e1.getValue().getid() + "::" + e1.getValue().aut() + "::"
						+ e1.getValue().pub());
			}
		}
	}

}

class Books {
	int id;
	String author;
	String published;

	public Books(int i, String a, String p) {
		id = i;
		author = a;
		published = p;
	}

	public int getid() {
		return id;
	}

	public String aut() {
		return author;
	}

	public String pub() {
		return published;
	}
}
