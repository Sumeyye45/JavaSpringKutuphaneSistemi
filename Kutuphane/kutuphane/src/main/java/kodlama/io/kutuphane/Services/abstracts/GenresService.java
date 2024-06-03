package kodlama.io.kutuphane.Services.abstracts;

import java.util.List;

import kodlama.io.kutuphane.entities.Genres;

public interface GenresService {
	 CreateGenresResponse add(CreateGenresRequest dto);
	    void update(UpdateGenresRequest dto);
	    void delete(int id);
	    List<Genres> getAll();

	    Genres getById(int id);
}
