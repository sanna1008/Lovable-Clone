package com.bitsmad.Lovable_Clone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitsmad.Lovable_Clone.dto.auth.AuthResponse;
import com.bitsmad.Lovable_Clone.dto.auth.LoginRequest;
import com.bitsmad.Lovable_Clone.dto.auth.SignupRequest;
import com.bitsmad.Lovable_Clone.dto.auth.UserProfileResponse;
import com.bitsmad.Lovable_Clone.service.AuthService;
import com.bitsmad.Lovable_Clone.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signUp(SignupRequest request) {
        return ResponseEntity.ok(authService.signUp(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile() {
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }
}
