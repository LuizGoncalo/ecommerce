package com.luizGoncalo.products.service;

import com.luizGoncalo.products.domain.Product;
import com.luizGoncalo.products.mapper.ProductMapper;
import com.luizGoncalo.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public Product findById(Long id) throws Exception{

        final Product response = productRepository.findById(id).orElseThrow(()-> new Exception("Produto não encontrado"));

        return response;

    }

}
