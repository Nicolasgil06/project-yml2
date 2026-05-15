package com.mycompany.project_yml2.repository;

import com.mycompany.project_yml2.domain.Factura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FacturaRepository extends MongoRepository<Factura, String> {
}
