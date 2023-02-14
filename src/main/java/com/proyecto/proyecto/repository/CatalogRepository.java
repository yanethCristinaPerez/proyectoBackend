package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.model.CatalogEntity;
import com.proyecto.proyecto.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {

    @Query("FROM CatalogEntity where gender.gender = :gender")
    List<CatalogEntity> getByGender(String gender);

    @Query("FROM CatalogEntity where category.category like %:category%")
    List<CatalogEntity> getByCategory(String category);

}
