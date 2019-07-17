package com.luizGoncalo.products.service;

import com.luizGoncalo.products.repository.ProductsRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }
}
