package com.example.JWT_RestAPI.service;

import com.example.JWT_RestAPI.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    /**
     * Gera um token JWT para o nome de usuario fornecido.
     *
     * @param username O nome de usuario para o qual um tokem JWT será gerado
     * @return Uma string contendo o token JWT gerado
     */
    public String generateToken(String username) {
        String token = JwtUtil.generateToken(username);
        return token;
    }

    /**
     * Extrai o nome de usuario de um token JWT
     *
     * @param token O token JWT do qual o nome de usuario será estraido.
     * @return uma tring contendo o nome de usuario extraido do token JWT
     */

    public String extractUsername(String token) {
        String username = JwtUtil.extractUsername(token);
        return username;
    }
}