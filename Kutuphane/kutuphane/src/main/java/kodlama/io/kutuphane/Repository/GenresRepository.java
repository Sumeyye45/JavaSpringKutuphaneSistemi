package kodlama.io.kutuphane.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.kutuphane.entities.Genres;

public interface GenresRepository extends JpaRepository<Genres, Integer>{

}
