package pl.coderslab.charity.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.model.UserEntity;

import java.util.Optional;


@Service
public interface UserService {


    @Transactional
    void saveUser(UserEntity user);

    Optional<UserEntity> findUserByEmail(String email);

    UserEntity findByName(String name);

}
