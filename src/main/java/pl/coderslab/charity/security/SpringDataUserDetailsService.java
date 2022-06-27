package pl.coderslab.charity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.coderslab.charity.model.UserEntity;
import pl.coderslab.charity.service.UserService;

import java.util.HashSet;
import java.util.Set;

public class SpringDataUserDetailsService implements UserDetailsService {

    private UserService userService;

    @Autowired
    public void setUserRepository(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username){
        UserEntity userEntity = userService.findByName(username);
        if(userEntity==null) {
            throw new UsernameNotFoundException(username);
        }
        Set<GrantedAuthority> grantedAuthoritySet = new HashSet<>();
        userEntity.getRoles().forEach(r->grantedAuthoritySet.add(new SimpleGrantedAuthority(r.getName())));
        return new CurrentUser(userEntity.getUserName(), userEntity.getPassword(), grantedAuthoritySet, userEntity) {
        };
    }
}
