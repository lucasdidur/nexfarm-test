package me.restapi.rest.services;

import me.restapi.rest.arquitetura.services.GenericServiceImpl;
import me.restapi.rest.documents.Produto;
import me.restapi.rest.documents.Taxa;
import me.restapi.rest.repositories.ProdutoRepository;
import me.restapi.rest.repositories.ProdutoRestricoesVendaRepository;
import me.restapi.rest.repositories.TaxaRepository;
import me.restapi.rest.responses.ProdutoSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService extends GenericServiceImpl<Produto, ProdutoRepository> {

    @Autowired
    ProdutoRestricoesVendaRepository produtoRestricoesVendaRepository;

    @Autowired
    TaxaRepository taxaRepository;

    @Autowired
    public ProdutoService(ProdutoRepository repository) {
        super(repository);
    }

    /**
     * Faz a busca dos produtos, das restrições e das taxas do cliente informado
     * @param clientId do cliente a ser buscado
     * @param nomeProduto do produto a ser buscado
     * @return lista de produtos com suas taxas calculadas
     */
    public List<ProdutoSearchResponse> findProducts(Integer clientId, String nomeProduto){

        List<Produto> resticoes = produtoRestricoesVendaRepository.findAllByIdCliente(clientId);
        List<Integer> restrictionsId = resticoes.stream().map(Produto::getProductId).collect(Collectors.toList());

        List<Taxa> taxas = taxaRepository.findAllByClientId(clientId);
        int icms = getTaxa(taxas, "ICMS");
        int ipi = getTaxa(taxas, "IPI");

        List<Produto> produtoList = repository.findProducts(nomeProduto, restrictionsId);

        List<ProdutoSearchResponse> produtoSearchResponseList = new ArrayList<>();

        for (Produto produto : produtoList) {
            ProdutoSearchResponse produtoSearchResponse = new ProdutoSearchResponse();
            produtoSearchResponse.setName(produto.getNome());
            Double produtoPreco = produto.getPreco();

            double taxaIPI = produtoPreco * (ipi / 100.0);
            double taxaICMS = produtoPreco * (icms / 100.0);

            double produtoTaxas =  taxaIPI + taxaICMS;

            produtoSearchResponse.setPrice(produtoPreco);
            produtoSearchResponse.setTaxes(produtoTaxas);

            produtoSearchResponseList.add(produtoSearchResponse);
        }

        return produtoSearchResponseList;
    }

    Integer getTaxa(List<Taxa> taxas, String tipo){
       return taxas.stream().filter(taxa -> taxa.getTipo().equals(tipo)).findFirst().map(Taxa::getPorcentagem).orElse(0);
    }

}
