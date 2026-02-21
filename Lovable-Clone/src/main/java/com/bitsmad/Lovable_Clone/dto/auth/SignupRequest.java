package com.bitsmad.Lovable_Clone.dto.auth;

public record SignupRequest(
    String email,
    String name,
    String password
) {
}

// dummy : new SignupRequest("[EMAIL_ADDRESS]", "password", "John Doe")
