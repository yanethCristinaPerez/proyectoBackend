package com.proyecto.proyecto.model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "invoice")
public class InvoiceEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_invoice", nullable = false)
    private Long idInvoice;

    @Column(name = "created")
    private LocalDate created;


    @ManyToOne
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "invoice", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Set<InvoiceDetailEntity> details;

    public Long getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Long idInvoice) {
        this.idInvoice = idInvoice;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<InvoiceDetailEntity> getDetails() {
        return details;
    }

    public void setDetails(Set<InvoiceDetailEntity> details) {
        this.details = details;
    }
}
