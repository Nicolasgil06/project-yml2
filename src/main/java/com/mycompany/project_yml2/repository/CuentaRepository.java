package com.mycompany.project_yml2.repository;

import com.mycompany.project_yml2.domain.Cuenta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CuentaRepository extends MongoRepository<Cuenta, String> {
}
