package com.appcenter.smallib.user.dto.request;

import lombok.Getter;

@Getter
public class UserUpdateRequestDto {
    private final String name;


    public UserUpdateRequestDto(String name) {
        this.name = name;
    }
}
