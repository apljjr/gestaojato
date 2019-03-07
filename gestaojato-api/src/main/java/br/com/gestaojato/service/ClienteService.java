package br.com.gestaojato.service;

import br.com.gestaojato.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> findAll();
    List<Cliente> findByNome(String nome);
    Optional<Cliente> findById(String id);
    Cliente save(Cliente cliente);
    void deleteById(String id);
}
