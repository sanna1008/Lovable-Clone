package com.bitsmad.Lovable_Clone.dto.auth;

public record UserProfileResponse(
    Long id,
    String email,
    String name,
    String avatarUrl
) {
}

// dummy : new UserProfileResponse(1L, "[EMAIL_ADDRESS]", "John Doe", "https://example.com/avatar.jpg")

