package me.restapi.rest.services;

import me.restapi.rest.arquitetura.services.GenericServiceImpl;
import me.restapi.rest.documents.ProdutoRestricoesVenda;
import me.restapi.rest.repositories.ProdutoRestricoesVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoRestricoesVendaService extends GenericServiceImpl<ProdutoRestricoesVenda,ProdutoRestricoesVendaRepository> {

    @Autowired
    public ProdutoRestricoesVendaService(ProdutoRestricoesVendaRepository repository) {
        super(repository);
    }
}
