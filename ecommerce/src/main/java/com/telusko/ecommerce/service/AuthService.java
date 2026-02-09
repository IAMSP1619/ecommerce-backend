package com.telusko.ecommerce.service;

import com.telusko.ecommerce.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final JwtUtil jwtUtil;

    public AuthService(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public String login(String username) {
        return jwtUtil.generateToken(username);
    }
}

