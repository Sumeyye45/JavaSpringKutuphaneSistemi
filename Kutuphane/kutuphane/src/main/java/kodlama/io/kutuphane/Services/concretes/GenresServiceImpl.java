package kodlama.io.kutuphane.Services.concretes;

import java.util.List;

import kodlama.io.kutuphane.Repository.GenresRepository;
import kodlama.io.kutuphane.Services.abstracts.CreateGenresRequest;
import kodlama.io.kutuphane.Services.abstracts.CreateGenresResponse;
import kodlama.io.kutuphane.Services.abstracts.GenresService;
import kodlama.io.kutuphane.Services.abstracts.UpdateGenresRequest;
import kodlama.io.kutuphane.entities.Genres;

public class GenresServiceImpl implements GenresService{
	
	 private final GenresRepository genresRepository;
	    private final ModelMapperService modelMapperService;

	@Override
	public CreateGenresResponse add(CreateGenresRequest dto) {
        Genres genres = modelMapperService.forRequest().map(dto,Genres.class);
        Genres savedGenres = genresRepository.save(genres);
        return new CreateGenresResponse(savedGenres.getId(), savedGenres.getName());

	}

	@Override
	public void update(UpdateGenresRequest dto) {
		Genres genres = modelMapperService.forRequest().map(dto,Genres.class);
        genresRepository.saveAndFlush(genres);
		
	}

	@Override
	public void delete(int id) {
		 GenresRepository.deleteById(id);
		
	}

	@Override
	public List<Genres> getAll() {
		return genresRepository.findAll();
	}

	@Override
	public Genres getById(int id) {
		return genresRepository.findById(id).orElseThrow();
	}
	

}
