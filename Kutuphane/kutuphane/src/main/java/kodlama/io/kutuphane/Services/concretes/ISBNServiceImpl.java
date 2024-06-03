package kodlama.io.kutuphane.Services.concretes;

import java.util.List;

import kodlama.io.kutuphane.Repository.ISBNRepository;
import kodlama.io.kutuphane.Services.abstracts.CreateISBNRequest;
import kodlama.io.kutuphane.Services.abstracts.CreateISBNResponse;
import kodlama.io.kutuphane.Services.abstracts.ISBNService;
import kodlama.io.kutuphane.entities.ISBN;

public class ISBNServiceImpl implements ISBNService{
	
	 private final ISBNRepository isbnRepository;
	 private final ModelMapperService modelMapperService;

	@Override
	public CreateISBNResponse add(CreateISBNRequest dto) {
		ISBN isbn = modelMapperService.forRequest().map(dto,ISBN.class);
        ISBN savedISBN =  isbnRepository.save(isbn);
        return new CreateISBNResponse(savedISBN.getId(),savedISBN.getNumber());
	}

	@Override
	public void update(ISBN dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ISBN> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISBN getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
