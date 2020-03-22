package me.restapi.rest.repositories;

import me.restapi.rest.documents.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}
