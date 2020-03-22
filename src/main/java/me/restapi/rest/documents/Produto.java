package me.restapi.rest.documents;

import me.restapi.rest.arquitetura.interfaces.IDocument;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "product")
public class Produto extends IDocument {

    @Indexed
    private Integer productId;

    @Field(name = "name")
    private String nome;

    @Field(name = "price")
    private Double preco;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "productId=" + productId +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
