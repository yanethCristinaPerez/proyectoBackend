package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<UserEntity, Long> {



}
