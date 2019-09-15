package com.luizGoncalo.products.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;

    @Column(name = "PRODUCT_NAME", nullable = false)
    public String descricao;

    @Column(name = "PRICE", nullable = false)
    public Long valor;

    @Column(name = "MANUFACTURER", nullable = false)
    public String fabricante;

    @Column(name = "PRODUCT_VALIDITY", nullable = false)
    public LocalDateTime validade;

}
