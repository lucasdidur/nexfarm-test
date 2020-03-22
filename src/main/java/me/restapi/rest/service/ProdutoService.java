package me.restapi.rest.service;

import me.restapi.rest.arquitetura.service.GenericServiceImpl;
import me.restapi.rest.documents.Produto;
import me.restapi.rest.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends GenericServiceImpl<Produto> {

    @Autowired
    public ProdutoService(ProdutoRepository repository) {
        super(repository);
    }
}
