package com.luizGoncalo.products.domain.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ProductRequest {

    @NotBlank
    public Long id;

    @NotBlank
    public String descricao;
}
