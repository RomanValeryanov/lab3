package libr;

import java.util.ArrayList;

public class Reader {
	private int readId;
	private String name;
	private String surname;
	private String patronymic;
	private String address;
	private String phoneNumber;
	
	private ArrayList<Book> books;
	
	Reader(int id, String n, String s, String p, String a, String pn) {
		this.readId = id;
		this.name = n;
		this.surname = s;
		this.patronymic = p;
		this.address = a;
		this.phoneNumber = pn;
		
		this.books = new ArrayList<Book>();
	}
	
	public int getReaderId() {
		return this.readId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public String getPatronymic() {
		return this.patronymic;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public boolean addBook(Book b) {
		return this.books.add(b);
	}
	
	public ArrayList<Book> getBooks() {
		return this.books;
	}
}
