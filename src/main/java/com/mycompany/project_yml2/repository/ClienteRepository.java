package com.mycompany.project_yml2.repository;

import com.mycompany.project_yml2.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
