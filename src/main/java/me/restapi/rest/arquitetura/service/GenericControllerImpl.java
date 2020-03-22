package me.restapi.rest.arquitetura.service;

import io.swagger.annotations.ApiOperation;
import me.restapi.rest.arquitetura.interfaces.IDocument;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public abstract class GenericControllerImpl<T extends IDocument, S extends GenericService<Long, T>> implements GenericController<Long, T> {

    private S service;

    public GenericControllerImpl(S service) {
        this.service = service;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<T>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @Override
    @GetMapping(path = "/{id}")
    public ResponseEntity<T> findById(@PathVariable(name = "id") Long id) {
        Optional<T> optional = service.findById(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        }

        return ResponseEntity.notFound().build();
    }

    @Override
    @PostMapping
    public ResponseEntity<T> insert(@RequestBody T entity) {
        return ResponseEntity.ok(service.insert(entity));
    }

    @Override
    @PostMapping(path = "/all")
    @ApiOperation(value = "Insere uma lista de documentos")
    public ResponseEntity<List<T>> insert(@RequestBody List<T> entity) {
        return ResponseEntity.ok(service.insert(entity));
    }

    @Override
    @PutMapping(path = "/{id}")
    public ResponseEntity<T> update(@PathVariable(name = "id") Long id, @RequestBody  T entity) {
        return ResponseEntity.ok(service.update(entity));
    }

    @Override
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Integer> delete(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return ResponseEntity.ok(1);
    }


}
