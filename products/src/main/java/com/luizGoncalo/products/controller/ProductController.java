package com.luizGoncalo.products.controller;

import com.luizGoncalo.products.domain.Product;
import com.luizGoncalo.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public Product productById(@PathVariable(name = "id") final Long id) throws Exception {

        return productService.findById(id);

    }

}