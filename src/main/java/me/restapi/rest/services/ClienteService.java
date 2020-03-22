package me.restapi.rest.services;

import me.restapi.rest.arquitetura.services.GenericServiceImpl;
import me.restapi.rest.documents.Cliente;
import me.restapi.rest.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends GenericServiceImpl<Cliente,ClienteRepository> {

    @Autowired
    public ClienteService(ClienteRepository repository) {
        super(repository);
    }
}
