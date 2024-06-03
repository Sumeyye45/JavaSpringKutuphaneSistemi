package kodlama.io.kutuphane.Services.abstracts;

import java.util.List;

import kodlama.io.kutuphane.entities.Borrow;

public interface BorrowService {
	 CreateBorrowResponse add(CreateBorrowRequest dto);
	    void update(UpdateBorrowRequest dto);
	    void delete(int id);
	    List<Borrow> getAll();

	    Borrow getById(int id);

}
