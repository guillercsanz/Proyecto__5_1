package com.daw2.proyecto5_1.funkos.models;


import com.daw2.proyecto5_1.categorias.models.Categoria;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "funkos", indexes = {
        @Index(name = "idx_funko_nombre",  columnList = "nombre"),
        @Index(name = "idx_funko_deleted", columnList = "is_deleted")
})
public class Funko {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String nombre;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(nullable = false)
    private Integer cantidad;

    /** LA RELACION. El lado dueño: aqui esta la clave ajena. */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "categoria_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_funko_categoria"))
    private Categoria categoria;

    @Column(name = "is_deleted", nullable = false)
    private boolean deleted = false;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    protected Funko() {}

    public Funko(String nombre, BigDecimal precio, Integer cantidad, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    /** Hibernate lo llama justo antes de cada UPDATE. */
    @PreUpdate
    void alActualizar() { this.updatedAt = LocalDateTime.now(); }

    public Long getId()                 { return id; }
    public String getNombre()           { return nombre; }
    public BigDecimal getPrecio()       { return precio; }
    public Integer getCantidad()        { return cantidad; }
    public Categoria getCategoria()     { return categoria; }
    public boolean isDeleted()          { return deleted; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }

    public void setNombre(String nombre)          { this.nombre = nombre; }
    public void setPrecio(BigDecimal precio)      { this.precio = precio; }
    public void setCantidad(Integer cantidad)     { this.cantidad = cantidad; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public void setDeleted(boolean borrado)       { this.deleted = borrado; }
}