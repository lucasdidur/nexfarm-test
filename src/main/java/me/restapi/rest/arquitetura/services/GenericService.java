package me.restapi.rest.arquitetura.services;

import java.util.List;
import java.util.Optional;

public interface GenericService<ID, T> {

    List<T> listAll();

    Optional<T> findById(ID id);

    T insert(T entity);

    List<T> insert(List<T> list);

    T update(T entity);

    void delete(ID id);

}
