package igor.entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NamedQuery(name = Book.FIND_ALL_BOOKS, query = "SELECT b FROM Book b ORDER BY b.title DESC")
public class Book {
	public static final String FIND_ALL_BOOKS = "FIND_ALL_BOOKS";
	@Id @GeneratedValue
	private Long id;
	@NotNull @Size(min = 4, max = 50)
	@Column(nullable=false)
	private String title;
	private Float price;
	@Column(length = 2000)
	private String description;
	private Integer nbOfPage;
	private Boolean illustrations;
	
	public Book(){}
	
	public Book(String title, Float price, String description, Integer nbOfPage, Boolean illustrations){
		this.title = title;
		this.price = price;
		this.description = description;
		this.nbOfPage = nbOfPage;
		this.illustrations = illustrations;
	}
	
	public Long getId(){
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNbOfPage() {
		return nbOfPage;
	}

	public void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}

	public Boolean getIllustrations() {
		return illustrations;
	}

	public void setIllustrations(Boolean illustrations) {
		this.illustrations = illustrations;
	}

	public static String getFindAllBooks() {
		return FIND_ALL_BOOKS;
	}
}
