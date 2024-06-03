package kodlama.io.kutuphane.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.kutuphane.entities.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
