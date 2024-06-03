package kodlama.io.kutuphane.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.kutuphane.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	 Optional<User> findByIdentityNoIgnoreCase(String identityNo);

}
