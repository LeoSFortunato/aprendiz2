package com.example.aprendiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Entity
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "idade")
    private Long idade;
    @Column(name = "documento_list")
    @OneToMany
    private List<Documento> documentoList;

}
