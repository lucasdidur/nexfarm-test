package me.restapi.rest.repositories;

import me.restapi.rest.documents.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, Long> {
}
