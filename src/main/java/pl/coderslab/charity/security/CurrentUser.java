package pl.coderslab.charity.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import pl.coderslab.charity.model.UserEntity;

import java.util.Collection;

public class CurrentUser extends User {

    private final UserEntity userEntity;

    public CurrentUser(String username, String password, Collection<? extends GrantedAuthority> authorities, UserEntity userEntity){
        super(username, password, authorities);
        this.userEntity=userEntity;

    }
    public UserEntity getUserEntity() {
        return userEntity;
    }
}

