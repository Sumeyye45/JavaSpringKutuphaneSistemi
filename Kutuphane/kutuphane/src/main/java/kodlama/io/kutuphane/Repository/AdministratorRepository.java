package kodlama.io.kutuphane.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.kutuphane.entities.Administrator;

public interface AdministratorRepository extends JpaRepository<Administrator,Integer>{
	
	Optional<Administrator> findByUserNameIgnoreCase(String userName);

}
