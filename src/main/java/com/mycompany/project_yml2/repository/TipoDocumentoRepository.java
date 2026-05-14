package com.mycompany.project_yml2.repository;

import com.mycompany.project_yml2.domain.TipoDocumento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TipoDocumentoRepository extends MongoRepository<TipoDocumento, String> {

    Optional<TipoDocumento> findBySigla(String sigla);
}
