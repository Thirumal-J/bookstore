package bookstore.model;
import java.awt.Image;

public class BookBuilder {
	
	private String title;
	private String description;
	private User user;
	private Image coverImage;
	private double price;
	
	public BookBuilder setTitle(String title) {
		this.title = title;
		return this;

	}
	public BookBuilder setDescription(String description) {
		this.description = description;
		return this;

	}
	public BookBuilder setUser(User user) {
		this.user = user;
		return this;

	}
	public BookBuilder setCoverImage(Image coverImage) {
		this.coverImage = coverImage;
		return this;

	}
	public BookBuilder setPrice(double price) {
		this.price = price;
		return this;

	}
	public Book getBook() {
		return new Book(title, description, user, coverImage, price);
	}
	
	
}
