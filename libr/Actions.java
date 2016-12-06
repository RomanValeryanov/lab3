package libr;

import java.util.Collections;
import java.util.HashMap;

public class Actions {
	
	public void getBooksByReader(Reader r) {
		System.out.println("Books of " + r.getSurname() + " " + r.getName() + " " + r.getPatronymic());
		for (Book b: r.getBooks())
			System.out.println("\t" + b.getBookName());
	}
	
	public void getBooksByReaders(Reader [] rs) {
		for(Reader r: rs) {
			this.getBooksByReader(r);
		}
	}
	
	public void getReadersByBook(Reader []rs , Book b) { 
		System.out.println("Readers " + b.getBookName());
		for(Reader r:rs) {
			for(Book bs : r.getBooks()) {
				if(bs.getBookName().equalsIgnoreCase(b.getBookName()) 
					&& bs.getAuthor().equalsIgnoreCase(b.getAuthor()) 
					&& bs.getCreateYear() == b.getCreateYear()) {
					System.out.println(String.format("\t%s %s %s | Start read:%s ; End read: %s", r.getSurname(), r.getName(), r.getPatronymic(), bs.getStartDate().toString(), bs.getEndDate().toString()));
				}
			}
		}
	}
	
	private String getMax(HashMap<String, Integer> map) {
		String res = "";
		int maxValueInMap=(Collections.max(map.values()));  
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {  
            if (entry.getValue()==maxValueInMap) {
                res =  entry.getKey();    
            }
        }
        
        return res;
	}
	
	
	public void getPopularBook(Reader []rs) {
		HashMap<String, Integer> resMap = new HashMap<String, Integer>();
		for(Reader r : rs) {
			for(Book b : r.getBooks()) {
				if(resMap.get(b.getBookName()) == null) {
					resMap.put(b.getBookName(), 1);
				}
				else {
					resMap.put(b.getBookName(), resMap.get(b.getBookName()) + 1);
				}
			}
		}
		System.out.println("Most read book is " + getMax(resMap));
	}
}
