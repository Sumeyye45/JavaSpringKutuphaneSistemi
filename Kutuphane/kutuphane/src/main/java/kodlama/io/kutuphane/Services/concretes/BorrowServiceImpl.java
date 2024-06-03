package kodlama.io.kutuphane.Services.concretes;

import java.util.List;

import kodlama.io.kutuphane.Repository.BorrowRepository;
import kodlama.io.kutuphane.Services.abstracts.BorrowService;
import kodlama.io.kutuphane.Services.abstracts.CreateBorrowRequest;
import kodlama.io.kutuphane.Services.abstracts.CreateBorrowResponse;
import kodlama.io.kutuphane.Services.abstracts.UpdateBorrowRequest;
import kodlama.io.kutuphane.entities.Borrow;

public class BorrowServiceImpl implements BorrowService{

	 private final BorrowRepository borrowRepository;
	    private final ModelMapperService modelMapperService;

	    @Override
	    public CreateBorrowResponse add(CreateBorrowRequest dto) {
	        Borrow borrow = modelMapperService.forRequest().map(dto,Borrow.class);
	        Borrow savedBorrow = borrowRepository.save(borrow);
	        return new CreateBorrowResponse(savedBorrow.getId(),savedBorrow.getUser().getId(),savedBorrow.getBook().getId());
	    }

	    @Override
	    public void update(UpdateBorrowRequest dto) {
	        Borrow borrow = modelMapperService.forRequest().map(dto,Borrow.class);
	        borrowRepository.saveAndFlush(borrow);

	    }

	    @Override
	    public void delete(int id) {
	    borrowRepository.deleteById(id);
	    }

	    @Override
	    public List<Borrow> getAll() {
	        return borrowRepository.findAll();
	    }

	    @Override
	    public Borrow getById(int id) {
	        return borrowRepository.findById(id).orElseThrow();
	    }

		@Override
		public CreateBorrowResponse add(CreateBorrowRequest dto) {
			// TODO Auto-generated method stub
			return null;
		}

}
