package com.bitsmad.Lovable_Clone.service;

import com.bitsmad.Lovable_Clone.dto.auth.AuthResponse;
import com.bitsmad.Lovable_Clone.dto.auth.LoginRequest;
import com.bitsmad.Lovable_Clone.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signUp(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
