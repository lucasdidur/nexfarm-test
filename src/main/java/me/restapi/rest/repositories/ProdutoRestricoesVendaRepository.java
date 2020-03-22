package me.restapi.rest.repositories;

import me.restapi.rest.documents.Produto;
import me.restapi.rest.documents.ProdutoRestricoesVenda;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProdutoRestricoesVendaRepository extends MongoRepository<ProdutoRestricoesVenda, Long> {

    List<Produto> findAllByIdCliente(Integer idCliente);

}
