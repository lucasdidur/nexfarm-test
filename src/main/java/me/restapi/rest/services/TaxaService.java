package me.restapi.rest.services;

import me.restapi.rest.arquitetura.services.GenericServiceImpl;
import me.restapi.rest.documents.Taxa;
import me.restapi.rest.repositories.TaxaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxaService extends GenericServiceImpl<Taxa, TaxaRepository> {

    @Autowired
    public TaxaService(TaxaRepository repository) {
        super(repository);
    }
}
