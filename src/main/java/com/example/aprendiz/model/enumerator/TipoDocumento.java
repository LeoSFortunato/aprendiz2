package com.example.aprendiz.model.enumerator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoDocumento {

    CPF(1L, "CPF"),
    RG(2L, "RG"),
    CNH(3L, "CNH");

    private Long codigo;
    private String descricao;

    public Long getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
