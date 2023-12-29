package com.example.picasso.filters;

import com.example.picasso.service.AuthService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    AuthService authService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,FilterChain filterChain) throws ServletException, IOException {
        /**
         * TODO
         *
         * extract Authorization Header
         * extract token from authorization header
         * validate the token
         * if token is valid:
         *      extract email from the token
         *      use the email to search the database for the user 'or'
         *      use a cache to search for the token
         *      create a UsernamePasswordAuthenticationToken using the user details
         *      create a SecurityContext object
         *      Add the SecurityContext to SecurityContextHolder. Example shown below:
         *
         *      > SecurityContext context = SecurityContextHolder.createEmptyContext();
         *      > UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
         *      > context.setAuthentication(authenticationToken);
         *      > SecurityContextHolder.setContext(context);
         *
         * After this process execute the filterChain.doFilter(request, response) to continue to next filter
         * If the authentication process should be broken at some instant of the code do the following:
         *      > filterChain.doFilter(request, response);
         *      > break;
         */
        UserDetails user = authService.userDetailsService().loadUserByUsername("");

        SecurityContext context = SecurityContextHolder.createEmptyContext();
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        context.setAuthentication(authenticationToken);
        SecurityContextHolder.setContext(context);
        filterChain.doFilter(request, response);

    }
}
