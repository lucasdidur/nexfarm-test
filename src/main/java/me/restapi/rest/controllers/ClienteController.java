package me.restapi.rest.controllers;

import io.swagger.annotations.Api;
import me.restapi.rest.arquitetura.service.GenericControllerImpl;
import me.restapi.rest.documents.Cliente;
import me.restapi.rest.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "/api/clientes")
@Api(value = "Cliente")
public class ClienteController extends GenericControllerImpl<Cliente, ClienteService> {

    @Autowired
    public ClienteController(ClienteService service) {
        super(service);
    }
}
