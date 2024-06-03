package kodlama.io.kutuphane.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.kutuphane.entities.Author;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

}
