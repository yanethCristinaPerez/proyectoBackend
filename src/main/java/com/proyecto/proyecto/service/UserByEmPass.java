package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.UserEntity;
import com.proyecto.proyecto.repository.UserByEmailPasswRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserByEmPass implements UserByEmailPasswRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UserEntity findUserByEmailPass(String email,String password) {

        final String jpql= "SELECT u FROM UserEntity u WHERE u.email =: EMAIL_PARAM AND u.password =: PASSWORD_PARAM";

        final Query query=entityManager.createQuery(jpql)
                .setParameter("EMAIL_PARAM",email)
                .setParameter("PASSWORD_PARAM",password);


         return (UserEntity) query.getSingleResult();
    }
}
