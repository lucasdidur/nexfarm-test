package me.restapi.rest.controllers;

import me.restapi.rest.arquitetura.service.GenericControllerImpl;
import me.restapi.rest.documents.Produto;
import me.restapi.rest.response.ProdutoSearchResponse;
import me.restapi.rest.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path = "/api/produtos")
public class ProdutoController extends GenericControllerImpl<Produto, ProdutoService> {

    @Autowired
    public ProdutoController(ProdutoService service) {
        super(service);
    }

    @PostMapping(path = "/search")
    public ResponseEntity<List<ProdutoSearchResponse>> procurar(@RequestHeader("clientId") Integer clientId, @RequestParam(name = "name") String nomeProduto){
           return ResponseEntity.ok(service.findProducts(clientId, nomeProduto));
    }

}
