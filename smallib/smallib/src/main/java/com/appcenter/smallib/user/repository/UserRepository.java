package com.appcenter.smallib.user.repository;

import com.appcenter.smallib.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
