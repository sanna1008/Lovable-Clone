package com.bitsmad.Lovable_Clone.service;
import com.bitsmad.Lovable_Clone.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}

