package com.oc.wildadventures.zuulserver.service;
/*
import com.oc.wildadventures.zuulserver.model.User;
import com.oc.wildadventures.zuulserver.proxies.MicroserviceUserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    MicroserviceUserProxy microserviceUserProxy;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Objects.requireNonNull(username);
        User user = microserviceUserProxy.getUserByFirstname(username);
        return user;
    }

    UserDetails anthentication(String username, String password) throws UsernameNotFoundException {
        Objects.requireNonNull(username);
        User user = new User();
        user = microserviceUserProxy.getUserByFirstname(username);

        if(user.getPassword() != null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

}
*/