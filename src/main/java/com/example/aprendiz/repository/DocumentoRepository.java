package com.example.aprendiz.repository;

import com.example.aprendiz.model.Documento;
import com.example.aprendiz.model.enumerator.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {
}
