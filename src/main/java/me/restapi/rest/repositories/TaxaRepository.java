package me.restapi.rest.repositories;

import me.restapi.rest.documents.Taxa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaxaRepository extends MongoRepository<Taxa, Long> {
}
