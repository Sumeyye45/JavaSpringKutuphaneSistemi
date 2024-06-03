package kodlama.io.kutuphane.Services.abstracts;

import java.util.List;

import kodlama.io.kutuphane.entities.Author;

public interface AuthorService {

	CreateAuthorResponse add(CreateAuthorRequest dto);
    void update(UpdateAuthorRequest dto);
    void delete(int id);
    List<Author> getAll();

    Author getById(int id);
}
