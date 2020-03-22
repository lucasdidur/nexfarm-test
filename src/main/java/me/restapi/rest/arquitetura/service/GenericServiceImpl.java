package me.restapi.rest.arquitetura.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class GenericServiceImpl<T, R extends MongoRepository<T, Long>> implements GenericService<Long, T> {

    protected R repository;

    public GenericServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public List<T> listAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public T insert(T entity) {
        return repository.insert(entity);
    }

    @Override
    public List<T> insert(List<T> list) {
        System.out.println("Inserindo " + list.size() + " registros");
        return list.stream().map(a -> repository.insert(a)).collect(Collectors.toList());
    }

    @Override
    public T update(T entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}