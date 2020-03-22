package me.restapi.rest.controllers;

import me.restapi.rest.arquitetura.controllers.GenericControllerImpl;
import me.restapi.rest.documents.Taxa;
import me.restapi.rest.services.TaxaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "/api/taxas")
public class TaxaController extends GenericControllerImpl<Taxa, TaxaService> {

    @Autowired
    public TaxaController(TaxaService service) {
        super(service);
    }
}
