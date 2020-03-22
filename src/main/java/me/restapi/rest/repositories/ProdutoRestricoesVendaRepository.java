package me.restapi.rest.repositories;

import me.restapi.rest.documents.ProdutoRestricoesVenda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRestricoesVendaRepository extends MongoRepository<ProdutoRestricoesVenda, Long> {
}
