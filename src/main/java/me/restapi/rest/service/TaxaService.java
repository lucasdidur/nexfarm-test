package me.restapi.rest.service;

import me.restapi.rest.arquitetura.service.GenericServiceImpl;
import me.restapi.rest.documents.Taxa;
import me.restapi.rest.repositories.TaxaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxaService extends GenericServiceImpl<Taxa> {

    @Autowired
    public TaxaService(TaxaRepository repository) {
        super(repository);
    }
}
