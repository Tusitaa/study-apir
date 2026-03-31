package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import lombok.Data;
@Data //inclui getter setter e constructor
public class Produto {
    private final Long id;
    private final String nome;
    private final BigDecimal valor;
}
