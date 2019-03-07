package br.com.gestaojato.service;

import br.com.gestaojato.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {
    List<Produto> findAll();
    Optional<Produto> findById(String id);
    List<Produto> findByNome(String nome);
    Produto save(Produto produto);
    void deleteById(String id);
}
