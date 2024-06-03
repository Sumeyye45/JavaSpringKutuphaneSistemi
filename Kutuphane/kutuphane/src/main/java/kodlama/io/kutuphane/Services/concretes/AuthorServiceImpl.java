package kodlama.io.kutuphane.Services.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import kodlama.io.kutuphane.Repository.AuthorRepository;
import kodlama.io.kutuphane.Services.abstracts.AuthorService;
import kodlama.io.kutuphane.entities.Author;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
	
	 private final AuthorRepository authorRepository;
	    private final ModelMapperService modelMapperService;
	    @Override
	    public CreateAuthorResponse add(CreateAuthorRequest dto) {
	        Author author = this.modelMapperService.forRequest().map(dto,Author.class);
	        Author savedAuthor = authorRepository.save(author);
	        return new CreateAuthorResponse(savedAuthor.getId(), savedAuthor.getFirstName(), savedAuthor.getLastName());
	    }

	    @Override
	    public void update(UpdateAuthorRequest dto) {
	        Author author = this.modelMapperService.forRequest().map(dto,Author.class);
	        Optional<Author> authorCheck = authorRepository.findById(dto.getId());
	        if(authorCheck.isEmpty())
	        {
	            throw new RuntimeException("ID bulunamadi");
	        }
	        authorRepository.saveAndFlush(author);
	    }

	    @Override
	    public void delete(int id) {
	        authorRepository.deleteById(id);
	    }

	    @Override
	    public List<Author> getAll() {
	        return authorRepository.findAll();
	    }

	    @Override
	    public Author getById(int id) {
	        return authorRepository.findById(id).orElseThrow();
	    }

}
