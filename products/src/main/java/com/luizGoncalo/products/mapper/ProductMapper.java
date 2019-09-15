package com.luizGoncalo.products.mapper;

import com.luizGoncalo.products.domain.Product;
import com.luizGoncalo.products.domain.response.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Mappings({
            @Mapping(target = "validade", dateFormat = "dd/MM/yyyy HH:mm")
    })
    ProductResponse productResponse (Product product);

    List<ProductResponse> productToProductResponse(List<Product> products);
}
