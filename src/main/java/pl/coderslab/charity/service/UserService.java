package pl.coderslab.charity.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.model.User;


@Service
public interface UserService {


    @Transactional
    void saveUser(User user);

}
