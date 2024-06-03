package kodlama.io.kutuphane.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlama.io.kutuphane.entities.User;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
	
	// private final UserService userService;
	
	    @GetMapping
	    public List<User> getAll()
	    {
	        return userService.getAll();
	    }
	    @GetMapping("getById")
	    public User getById(int id)
	    {
	        return userService.getById(id);
	    }
	    @PostMapping
	    public ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid CreateUserRequest dto)
	    {
	        CreateUserResponse response =  userService.add(dto);
	        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(response.getId()).toUri();
	        return ResponseEntity.created(location).body(response);
	    }
	    @DeleteMapping("delete")
	    public void deleteUser(@RequestParam int id)
	    {
	        userService.delete(id);
	    }
	    @PutMapping("update")
	    public void updateUser(@RequestBody @Valid UpdateUserRequest dto)
	    {
	        userService.update(dto);

	    }

}
