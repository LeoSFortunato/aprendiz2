package com.example.aprendiz.model;

import com.example.aprendiz.model.enumerator.TipoDocumento;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Entity
@Data
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Long id;
    @Column(name = "numero")
    private Long numero;
    @Column(name = "tipo_documento")
    private TipoDocumento tipoDocumento;

}
