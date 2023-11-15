package com.appcenter.smallib.user.dto.response;

import lombok.Builder;

public class UserResponseDto {

    private final String name;

    private final String studentId;

    private final String email;

    @Builder
    public UserResponseDto(String name, String studentId, String email) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
    }
}
