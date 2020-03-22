package me.restapi.rest.arquitetura.controllers;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GenericController<ID, T> {

    ResponseEntity<List<T>> listAll();

    ResponseEntity<T> findById(ID id);

    ResponseEntity<T> insert(T entity);

    ResponseEntity<List<T>> insert(List<T> entity);

    ResponseEntity<T> update(ID id, T entity);

    ResponseEntity<Integer> delete(ID id);

}
