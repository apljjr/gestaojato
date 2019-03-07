package br.com.gestaojato.service.impl;


import br.com.gestaojato.model.Produto;
import br.com.gestaojato.repository.ProdutoRepository;
import br.com.gestaojato.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> findById(String id) {
        return produtoRepository.findById(id);
    }

    @Override
    public List<Produto> findByNome(String nome) {
        return produtoRepository.findByNome(nome);
    }

    @Override
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void deleteById(String id) {
        produtoRepository.deleteById(id);
    }
}
