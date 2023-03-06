package com.proyecto.proyecto.entidades;


import jakarta.persistence.*;

@Entity
@Table(name = "tipos_documentos")
public class TiposDocumentos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_tipo_documento", nullable = false)
    private Long idTipoDocumento;

    private String tipoDocumento;

    public TiposDocumentos() {
    }

    public TiposDocumentos(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    public Long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
