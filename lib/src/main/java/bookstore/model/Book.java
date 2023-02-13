package bookstore.model;
import java.awt.Image;

public class Book {
	
	private final String title;
	private final String description;
	private final User user;
	private final Image coverImage;
	private final double price;
	
	public Book(String title, String description, User user, Image coverImage, double price) {
		super();
		this.title = title;
		this.description = description;
		this.user = user;
		this.coverImage = coverImage;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", description=" + description + ", user=" + user + ", coverImage=" + coverImage
				+ ", price=" + price + "]";
	}
		
	
}
