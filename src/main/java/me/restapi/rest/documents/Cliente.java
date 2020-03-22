package me.restapi.rest.documents;

import me.restapi.rest.arquitetura.interfaces.IDocument;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotEmpty;

@Document(collection = "client")
public class Cliente extends IDocument {

    @Indexed
    private Integer idCliente;

    @NotEmpty
    @Field(name = "Nome")
    private String nome;

    @NotEmpty
    @CNPJ
    @Field(name = "CNPJ")
    private String cnpj;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
