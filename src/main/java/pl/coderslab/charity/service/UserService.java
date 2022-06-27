package pl.coderslab.charity.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.model.User;

import java.util.Optional;


@Service
public interface UserService {


    @Transactional
    void saveUser(User user);

    Optional<User> findUserByEmail(String email);

}
