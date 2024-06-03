package kodlama.io.kutuphane.Services.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.kutuphane.Repository.BookRepository;
import kodlama.io.kutuphane.Services.abstracts.BookService;
import kodlama.io.kutuphane.Services.abstracts.CreateBookRequest;
import kodlama.io.kutuphane.Services.abstracts.CreateBookResponse;
import kodlama.io.kutuphane.Services.abstracts.UpdateBookRequest;
import kodlama.io.kutuphane.entities.Book;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

	  private final BookRepository bookRepository;
	    private final ModelMapperService modelMapperService;
	    @Override
	    public CreateBookResponse add(CreateBookRequest dto) {
	        Book book = this.modelMapperService.forRequest().map(dto,Book.class);
	        Book savedBook = bookRepository.save(book);
	        return new CreateBookResponse(savedBook.getId(), savedBook.getBookName());
	    }

	    @Override
	    public void update(UpdateBookRequest dto) {
	        Book book = this.modelMapperService.forRequest().map(dto,Book.class);
	        bookRepository.saveAndFlush(book);
	    }

	    @Override
	    public void delete(int id) {
	        bookRepository.deleteById(id);
	    }

	    @Override
	    public List<Book> getAll() {
	        return bookRepository.findAll();
	    }

	    @Override
	    public Book getById(int id) {
	        return bookRepository.findById(id).orElseThrow();

}}
