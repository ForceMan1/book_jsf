package igor.controller;
import igor.ejb.BookEJB;
import igor.entity.Book;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.*;

@Named
@RequestScoped
public class BookController {
	@Inject
	private BookEJB bookEjb;
	private Book book = new Book();
	
	public String doCreateBook(){
		bookEjb.createBook(book);
				
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Book created", "The book " + book.getTitle() + " has been created with id=" +
						book.getId()));
		return "newBook.xhtml";
	}
	
	public void doFindBookById(){
		book = bookEjb.findBookById(book.getId());
	}
	
	public Book getBook(){
		return book;
	}
	
	public void setBook(Book book){
		this.book = book;
	}
}
