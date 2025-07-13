package com.hari.springwebproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody AuthRequest authRequest) {
        if ("hari".equals(authRequest.getUsername()) && "1234".equals(authRequest.getPassword())) {
            return jwtUtil.generateToken(authRequest.getUsername());
        } else {
            return "Invalid credentials";
        }
    }
}