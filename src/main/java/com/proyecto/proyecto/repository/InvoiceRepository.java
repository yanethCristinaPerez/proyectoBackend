package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.model.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Long> {
}
