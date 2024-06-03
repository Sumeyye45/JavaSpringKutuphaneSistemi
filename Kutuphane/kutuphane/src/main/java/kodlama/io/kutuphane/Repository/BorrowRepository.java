package kodlama.io.kutuphane.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.kutuphane.entities.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow,Integer>{

}
