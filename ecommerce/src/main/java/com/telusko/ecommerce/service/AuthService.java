package com.telusko.ecommerce.service;

import com.telusko.ecommerce.repository.UserRepository;
import com.telusko.ecommerce.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final JwtUtil jwtUtil;
    private final UserRepository repo;

    public AuthService(JwtUtil jwtUtil, UserRepository repo) {
        this.jwtUtil = jwtUtil;
        this.repo = repo;
    }

    public String login(String username,String password) {

        return repo.findAll().stream()
                .filter(u -> u.getUsername().equals(username)
                        && u.getPassword().equals(password))
                .findFirst()
                .map(u -> jwtUtil.generateToken(username))
                .orElseThrow(() ->
                        new RuntimeException("Invalid login"));
    }
}
