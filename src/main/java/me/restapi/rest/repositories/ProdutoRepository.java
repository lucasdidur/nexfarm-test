package me.restapi.rest.repositories;

import me.restapi.rest.documents.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProdutoRepository extends MongoRepository<Produto, Long> {

    @Query(value = "{'name': {$regex : ?0, $options: 'i'}, 'productId': { '$not': { '$in': ?1 } } }")
    List<Produto> findProducts(String nomeProduto, List<Integer> restrictions);
}
