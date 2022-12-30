package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.model.CatalogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {
}
