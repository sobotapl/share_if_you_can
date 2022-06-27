package pl.coderslab.charity.service;
import lombok.Data;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.UserEntity;
import pl.coderslab.charity.repository.UserRepository;

import java.util.Optional;

@Data
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void saveUser(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public Optional<UserEntity> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
