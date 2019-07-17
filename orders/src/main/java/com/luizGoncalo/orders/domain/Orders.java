package com.luizGoncalo.orders.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
	private Customer customer;

    @Column(nullable = false)
    private Products products;

    @Column(nullable = false)
    private String mensage;

    @Column(nullable = false)
    private String status;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime purchaseDate;
}
