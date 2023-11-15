package com.appcenter.smallib.user.dto.request;

import com.appcenter.smallib.user.domain.User;

public class UserCreateRequestDto {

    private final String name;

    private final String studentId;

    private final String email;

    public User toEntity() {
        return User.builder()
                .name(name)
                .studentId(studentId)
                .email(email)
                .build();
    }

    public UserCreateRequestDto(String name, String studentId, String email) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
    }
}
