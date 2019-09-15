package com.luizGoncalo.products.domain.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductResponse {

    public String descricao;

    public Long valor;

    public LocalDateTime validade;

}
