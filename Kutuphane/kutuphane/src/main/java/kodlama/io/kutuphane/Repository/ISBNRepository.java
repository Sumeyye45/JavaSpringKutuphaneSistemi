package kodlama.io.kutuphane.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.kutuphane.entities.ISBN;

public interface ISBNRepository extends JpaRepository<ISBN, Integer>{
	

}
