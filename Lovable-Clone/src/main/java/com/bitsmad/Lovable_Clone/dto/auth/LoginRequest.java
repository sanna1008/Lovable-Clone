package com.bitsmad.Lovable_Clone.dto.auth;

public record LoginRequest(
        String email,
        String password) {
}

// dummy : new LoginRequest("[EMAIL_ADDRESS]", "password")
