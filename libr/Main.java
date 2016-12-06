package libr;

import java.sql.Date;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Actions objAc = new Actions();
		
		Book woomen = new Book("Charles Bukowski", "Women",  1978, 200, true, "Women is centered on Chinaski's later life, as a celebrated poet and writer, not as a dead-end lowlife",
				new Date(2016 - 1900, 3, 12), new Date(2016 - 1900, 4, 12));
		
		Reader ivR = new Reader(1, "Ivan", "Ivanov", "Ivanovich", "Lenina 8", "33333" );
		ivR.addBook(new Book("George Orwell", "1984", 1949, 150, false, "is a dystopian novel by English author George Orwell published in 1949",
				new Date(2015 - 1900, 4, 13), new Date(2015 - 1900, 5, 13)));
		ivR.addBook(new Book("Charles Bukowski","Women",  1978, 200, true, "Women is centered on Chinaski's later life, as a celebrated poet and writer, not as a dead-end lowlife",
				new Date(2015 - 1900, 3, 12), new Date(2015 - 1900, 4, 12)));
		
		Reader alR = new Reader(2, "Alexey", "Petrov", "Ivanovich", "Volhov 2", "56781" );
		alR.addBook(new Book("Charles Bukowski", "Women",  1978, 200, true, "Women is centered on Chinaski's later life, as a celebrated poet and writer, not as a dead-end lowlife",
				new Date(2016 - 1900, 3, 12), new Date(2016 - 1900, 4, 12)));
		
		Reader evR = new Reader(3, "Evgenii", "Sergeev", "Alexeevich", "Lenina 2", "39821" );
		evR.addBook(new Book( "Charles Bukowski", "Women", 1978, 200, true, "Women is centered on Chinaski's later life, as a celebrated poet and writer, not as a dead-end lowlife",
				new Date(2014 - 1900, 3, 12), new Date(2014 - 1900, 4, 12)));
		evR.addBook( new Book("Leo Tolstoy", "War and Peace",  1869, 300, false, "It is regarded as one of the central works of world literature",
				new Date(2016 - 1900, 3, 13), new Date(2016 - 1900, 4, 13)));
		Reader [] rs = {
				ivR,
				alR,
				evR
		};
		
		//objAc.getBooksByReader(evR);
		//objAc.getBooksByReaders(rs);
//		objAc.getPopularBook(rs);
		objAc.getReadersByBook(rs, woomen);
	}

}
