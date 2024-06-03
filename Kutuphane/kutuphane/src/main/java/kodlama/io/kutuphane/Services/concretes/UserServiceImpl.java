package kodlama.io.kutuphane.Services.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import kodlama.io.kutuphane.Repository.UserRepository;
import kodlama.io.kutuphane.Services.abstracts.CreateUserRequest;
import kodlama.io.kutuphane.Services.abstracts.CreateUserResponse;
import kodlama.io.kutuphane.Services.abstracts.UpdateUserRequest;
import kodlama.io.kutuphane.Services.abstracts.UserService;
import kodlama.io.kutuphane.entities.User;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	 private final UserRepository userRepository;
	 private final ModelMapperService modelMapperService;

	@Override
	public CreateUserResponse add(CreateUserRequest dto) {
		 findByIdentityNoIgnoreCase(dto.getIdentityNo());
	        User user = modelMapperService.forRequest().map(dto,User.class);
	        User userSaved = userRepository.save(user);
	        return new CreateUserResponse(userSaved.getId(), userSaved.getIdentityNo());
	}

	@Override
	public void update(UpdateUserRequest dto) {
		User user = modelMapperService.forRequest().map(dto,User.class);
        userRepository.saveAndFlush(user);
		
	}

	@Override
	public void delete(int id) {
		UserRepository.deleteById(id);
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User getById(int id) {
		 return userRepository.findById(id).orElseThrow();
	}
	
	
	 public void findByIdentityNoIgnoreCase(String identityNo)
	    {
	        Optional<User> hasUserIdentityNo =  userRepository.findByIdentityNoIgnoreCase(identityNo);
	        if(hasUserIdentityNo.isPresent())
	        {
	            throw new BusinessException("Bu kimlik numarasına kayıtlı kullanıcı bulunmakta");
	        }
	    }
	
	
	
	
	
	
	
	
	
	

}
