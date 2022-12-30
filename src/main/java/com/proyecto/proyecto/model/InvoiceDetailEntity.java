package com.proyecto.proyecto.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ivoice_detail")
public class InvoiceDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_invoice_detail", nullable = false)
    private Long idInvoiceDetail;

    @ManyToOne
    @JoinColumn(name = "catalog_id_product_catalog")
    private CatalogEntity catalog;

    @ManyToOne
    @JoinColumn(name = "invoice_id_invoice")
    private InvoiceEntity invoice;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "amountUnit")
    private BigDecimal amountUnit;

    @Column(name = "totalAmount")
    private BigDecimal totalAmount;

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(BigDecimal amountUnit) {
        this.amountUnit = amountUnit;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public InvoiceEntity getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceEntity invoice) {
        this.invoice = invoice;
    }

    public CatalogEntity getCatalog() {
        return catalog;
    }

    public void setCatalog(CatalogEntity catalog) {
        this.catalog = catalog;
    }

    public Long getIdInvoiceDetail() {
        return idInvoiceDetail;
    }

    public void setIdInvoiceDetail(Long idInvoiceDetail) {
        this.idInvoiceDetail = idInvoiceDetail;
    }
}
