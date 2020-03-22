package me.restapi.rest.documents;

import me.restapi.rest.arquitetura.interfaces.IDocument;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "taxes")
public class Taxa extends IDocument {

    @Indexed
    private Integer clientId;

    @Field(name = "type")
    private String tipo;

    @Field(name = "percentage")
    private Integer porcentagem;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Integer porcentagem) {
        this.porcentagem = porcentagem;
    }


    @Override
    public String toString() {
        return "Taxa{" +
                "clientId=" + clientId +
                ", tipo='" + tipo + '\'' +
                ", porcentagem=" + porcentagem +
                '}';
    }
}
