package me.restapi.rest.documents;

import me.restapi.rest.arquitetura.interfaces.IDocument;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productSellingRestrictions")
public class ProdutoRestricoesVenda extends IDocument {

    @Indexed
    private Integer idCliente;

    @Indexed
    private Integer idProduto;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
}
