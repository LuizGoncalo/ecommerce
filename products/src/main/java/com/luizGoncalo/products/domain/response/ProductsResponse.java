package com.luizGoncalo.products.domain.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductsResponse {

    private Long id;

    private String name;

    private double price;

    private LocalDateTime createdAt;
}
