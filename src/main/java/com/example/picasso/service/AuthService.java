package com.example.picasso.service;

import com.example.picasso.model.User;
import com.example.picasso.model.dto.auth.CreateUserRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class AuthService {
    public void createUser(CreateUserRequestDTO body){
        System.out.println("OK");
    }

    /**
     * TODO
     *
     * Create a service function to search for the user in Database
     */

    public UserDetailsService userDetailsService(){
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                // goto db to fimd user
                User user = new User(1L, "Mohammed", "Riyas", "riyas@picasso.com", "password");
                return user;

            }
        };

    }


    /**
     * TODO:
     *
     * Create 'JwtAuthenticationFilter' class in filter package,
     * annotate the class with Component, RequiredArgsConstructor
     * JwtAuthenticationFilter class should extends OncePerRequestFilter (Inbuilt)
     *
     * Override the function doFilterInternal, from OncePerRequestFilter
     * this function has 3 args:
     *          @NonNull HttpServletRequest request,
     *          @NonNull HttpServletResponse response,
     *          @NonNull FilterChain chain
     *
     * this function throws IOException and ServletException
     *
     * [Not Required] this function should get the request header
     * [Not Required] extract the token from the header
     * [Not Required] validate the token
     * [Not Required] check if a user is present for the token
     *
     * > chain.doFilter(request, response)
     *
     *
     */


}
