package com.mycompany.project_yml2.repository;


import com.mycompany.project_yml2.domain.TipoDocumento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface TipoDocumentoRepository extends MongoRepository<TipoDocumento, String> {
    // method query
    Optional<TipoDocumento> findBySigla(String sigla);

    @Query("""
        {
            'sigla': ?0
        }
    """)
    Optional<TipoDocumento> buscarPorSigla(String sigla);
}