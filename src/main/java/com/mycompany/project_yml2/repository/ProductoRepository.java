package com.mycompany.project_yml2.repository;

import com.mycompany.project_yml2.domain.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, String> {
}