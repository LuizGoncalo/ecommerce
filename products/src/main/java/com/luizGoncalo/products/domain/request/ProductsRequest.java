package com.luizGoncalo.products.domain.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ProductsRequest {

    @NotBlank
    private Long id;

}
