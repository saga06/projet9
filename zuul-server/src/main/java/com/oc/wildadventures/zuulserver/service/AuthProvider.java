package com.oc.wildadventures.zuulserver.service;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthProvider extends DaoAuthenticationProvider {

    @Autowired
    UserService userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException{

        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;

        String name = auth.getName();
        String password = auth.getCredentials().toString();

        UserDetails user = userDetailsService.anthentication(name,password);

        if(user == null){
            throw new BadCredentialsException("Wrong username");
        }

        return new UsernamePasswordAuthenticationToken(user, null,user.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication){
        return true;
    }
}
*/