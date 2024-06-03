package kodlama.io.kutuphane.Services.abstracts;

import java.util.List;

import kodlama.io.kutuphane.entities.Administrator;

public interface AdministratorService {

	CreateAdministratorResponse add(CreateAdministratorRequest dto);
    void update(UpdateAdministratorRequest dto);
    void delete(int id);
    List<Administrator> getAll();

    Administrator getById(int id);
}
