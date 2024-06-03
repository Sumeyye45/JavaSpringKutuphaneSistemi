package kodlama.io.kutuphane.Services.abstracts;

import java.util.List;

import kodlama.io.kutuphane.entities.Book;

public interface BookService {

	 CreateBookResponse add(CreateBookRequest dto);
	    void update(UpdateBookRequest dto);
	    void delete(int id);
	    List<Book> getAll();

	    Book getById(int id);
}
