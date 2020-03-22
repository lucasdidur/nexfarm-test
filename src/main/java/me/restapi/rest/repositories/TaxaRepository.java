package me.restapi.rest.repositories;

import me.restapi.rest.documents.Taxa;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaxaRepository extends MongoRepository<Taxa, Long> {

    List<Taxa> findAllByClientId(Integer clientId);

}
