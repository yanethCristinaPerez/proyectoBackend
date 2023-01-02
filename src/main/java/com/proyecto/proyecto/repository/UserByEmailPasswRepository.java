package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.model.UserEntity;

public interface UserByEmailPasswRepository {

    UserEntity findUserByEmailPass(String email,String password);
}
