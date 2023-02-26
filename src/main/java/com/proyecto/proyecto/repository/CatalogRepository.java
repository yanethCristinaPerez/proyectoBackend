package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.model.CatalogEntity;
import com.proyecto.proyecto.model.LogCatalog;
import com.proyecto.proyecto.model.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
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

    @Query("SELECT p FROM CatalogEntity p WHERE (p.description LIKE %?1% OR p.color.color LIKE %?1% OR p.brand.brand LIKE %?1%) AND p.gender.gender=?2")
    List<CatalogEntity> findCatalogEntityByDescriptionEqualsIgnoreCaseOrColorEqualsIgnoreCaseOrBrandEqualsIgnoreCaseAndGender(String term, String descrip);


    @Modifying
    @Query(value = "insert into log_catalog (id,nombre) VALUES (:id,:nombre)", nativeQuery = true)
    @Transactional
    void guardarLog( @Param("id") int id, @Param("nombre") String name);




}
