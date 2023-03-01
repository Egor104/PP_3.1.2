package com.grigorev.PP_312.repository;

import com.grigorev.PP_312.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
