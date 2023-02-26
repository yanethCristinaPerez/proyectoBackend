package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.model.LogCatalog;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogCatalogRepository extends JpaRepository<LogCatalog,Long> {

    @Modifying
    @Query(value = "SELECT id_product_catalog, name, COUNT(*) FROM log_catalog GROUP BY id_product_catalog, name limit 4", nativeQuery = true)
    @Transactional
    List<String> mostrarLog();

}
