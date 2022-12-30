package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
