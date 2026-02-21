package com.bitsmad.Lovable_Clone.dto.auth;


public record AuthResponse(String token, UserProfileResponse user) {
}

// dummy : new AuthResponse("dummy-token", new UserProfileResponse(1L, "[EMAIL_ADDRESS]", "John Doe", "https://example.com/avatar.jpg"))
