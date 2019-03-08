package br.com.gestaojato.service;

import br.com.gestaojato.model.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {
    List<Pedido> findAll();
    Optional<Pedido> findById(String id);
    Pedido criar(Pedido pedido);
    Pedido atualizar(Pedido pedido);
}
