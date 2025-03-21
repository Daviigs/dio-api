package dio_api_rest.service.Impl;

import dio_api_rest.domain.model.User;
import dio_api_rest.domain.repository.UserRepository;
import dio_api_rest.service.UserService;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long id){
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("Essa conta já existe.");
        }
        return userRepository.save(userToCreate);
    }
}
