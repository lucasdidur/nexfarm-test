package me.restapi.rest.arquitetura.interfaces;

import org.springframework.data.annotation.Id;

public abstract class IEntity extends IDocument {

    @Id
    public Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
