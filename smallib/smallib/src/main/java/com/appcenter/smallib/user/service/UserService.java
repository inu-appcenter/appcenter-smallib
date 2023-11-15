package com.appcenter.smallib.user.service;

import com.appcenter.smallib.user.domain.User;
import com.appcenter.smallib.user.dto.request.UserCreateRequestDto;
import com.appcenter.smallib.user.dto.request.UserUpdateRequestDto;
import com.appcenter.smallib.user.dto.response.UserResponseDto;
import com.appcenter.smallib.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDto createUser(final UserCreateRequestDto userCreateRequestDto) {
        User user = userRepository.save(userCreateRequestDto.toEntity());
        return user.toDto(user);
    }

    public UserResponseDto readUser(final Long userId) {
        User user = findById(userId);
        return user.toDto(user);
    }

    public UserResponseDto updateUser(final Long userId, final UserUpdateRequestDto userUpdateRequestDto) {
        User user = findById(userId);
        user.update(userUpdateRequestDto);
        userRepository.save(user);
        return user.toDto(user);
    }

    public void deleteUser(final Long userId) {
        User user = findById(userId);
        userRepository.delete(user);
    }

    private User findById(final Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(NoSuchElementException::new);
    }

}
