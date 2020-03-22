package me.restapi.rest.controllers;

import me.restapi.rest.arquitetura.service.GenericControllerImpl;
import me.restapi.rest.documents.Produto;
import me.restapi.rest.response.ProdutoSearchResponse;
import me.restapi.rest.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "/api/produtos")
public class ProdutoController extends GenericControllerImpl<Produto, ProdutoService> {

    @Autowired
    public ProdutoController(ProdutoService service) {
        super(service);
    }

    @PostMapping(path = "/search")
    public ResponseEntity<ProdutoSearchResponse> procurar(@RequestParam(name = "name") String nomeProduto){
        ProdutoSearchResponse produtoSearchResponse = new ProdutoSearchResponse();


        return ResponseEntity.ok(produtoSearchResponse);
    }

}
