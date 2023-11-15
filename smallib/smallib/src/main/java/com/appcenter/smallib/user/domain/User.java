package com.appcenter.smallib.user.domain;

import com.appcenter.smallib.user.dto.request.UserUpdateRequestDto;
import com.appcenter.smallib.user.dto.response.UserResponseDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Table(name = "user_tb")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;

    private String studentId;

    private String email;

    public void update(UserUpdateRequestDto userUpdateRequestDto) {
        this.name = userUpdateRequestDto.getName();
    }

    @Builder
    public User(Long id, String name, String studentId, String email) {
        this.id = id;
        this.name = name;
        this.studentId = studentId;
        this.email = email;
    }

    public UserResponseDto toDto(User user) {
        return UserResponseDto.builder()
                .name(user.getName())
                .email(user.getEmail())
                .studentId(user.getStudentId())
                .build();
    }
}
