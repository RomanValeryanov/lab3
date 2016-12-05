package libr;

import java.util.Date;

public class Book {
	private String author;
	private String bookName;
	private int crYear;
	private int price;
	private boolean isNew;
	private String annotation;
	
	private Date startRead;
	private Date endRead;
	
	Book(String a, String n, int y, int p, boolean isNew, String an, Date sd, Date ed) {
		this.author = a;
		this.bookName = n;
		this.crYear = y;
		this.price = p;
		this.isNew = isNew;
		this.annotation = an;
		this.startRead = sd;
		this.endRead = ed;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public int getCreateYear() {
		return this.crYear;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public boolean isNew() {
		return this.isNew;
	}
	
	public String getAnnotation() {
		return this.annotation;
	}
	
	public Date getStartDate() {
		return this.startRead;
	}
	
	public Date getEndDate() {
		return this.endRead;
	}
}
