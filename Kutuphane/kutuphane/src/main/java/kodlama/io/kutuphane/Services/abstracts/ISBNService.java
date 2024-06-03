package kodlama.io.kutuphane.Services.abstracts;

import java.util.List;

import kodlama.io.kutuphane.entities.ISBN;

public interface ISBNService {
	 CreateISBNResponse add(CreateISBNRequest dto);
	    void update(ISBN dto);
	    void delete(int id);
	    List<ISBN> getAll();

	    ISBN getById(int id);

}
