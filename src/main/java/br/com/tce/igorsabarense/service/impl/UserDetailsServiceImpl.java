package br.com.tce.igorsabarense.service.impl;

import br.com.tce.igorsabarense.entity.User;
import br.com.tce.igorsabarense.service.facade.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private Facade facade;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = facade.repository.user.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(user);
    }

//    public Collection<? extends GrantedAuthority> getAuthorities(Set<Role> roles) {
//
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//
//        for (Role role : roles) {
//            authorities.add(new SimpleGrantedAuthority(role.getName()));
//        }
//
//        return authorities;
//    }

}