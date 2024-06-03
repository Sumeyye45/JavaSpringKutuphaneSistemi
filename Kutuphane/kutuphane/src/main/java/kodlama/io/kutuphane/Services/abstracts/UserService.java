package kodlama.io.kutuphane.Services.abstracts;

import java.util.List;

import kodlama.io.kutuphane.entities.User;

public interface UserService {

	
	CreateUserResponse add(CreateUserRequest dto);
    void update(UpdateUserRequest dto);
    void delete(int id);
    List<User> getAll();

    User getById(int id);
	
}
