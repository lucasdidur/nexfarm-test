package me.restapi.rest.controllers;

import me.restapi.rest.arquitetura.controllers.GenericControllerImpl;
import me.restapi.rest.documents.ProdutoRestricoesVenda;
import me.restapi.rest.services.ProdutoRestricoesVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "/api/productSellingRestrictions")
public class ProdutoRestricoesVendaController extends GenericControllerImpl<ProdutoRestricoesVenda, ProdutoRestricoesVendaService> {

    @Autowired
    public ProdutoRestricoesVendaController(ProdutoRestricoesVendaService service) {
        super(service);
    }
}
