package mediaProducts;

import homework3.Genre;

/* This is the super class of MediaProduct
 * The CD, Tape, and Vinyl classes are all subclasses
 */
public class MediaProduct {
	
	protected String title;
	protected double price;
	protected int year;
	protected Genre genre;
	
	
	/* Generic Constructor */
	public MediaProduct() {
		
	}
	
	/* Non Generic Constructor*/
	public MediaProduct(String title, double price, int year, Genre genre) {
		this.title = title;
		this.price = price;
		this.year = year;
		this.genre = genre;
	}
	
	public MediaProduct(MediaProduct product) {
		this.title = product.title;
		this.genre = product.genre;
		this.price = product.price;
		this.year = product.year;
	}
	
	/* Getters and setters */
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	
	public String toString() {
		return "Title: " + title + ", price: " + price + ", year: " + year + ", genre: " + genre + ".";
	}
	
	public String printFormat() {
		return "" + title + "," + price + "," + year + "," + genre + "\n";
	}
	
}
