package br.com.gestaojato.service.impl;

import br.com.gestaojato.model.Pedido;
import br.com.gestaojato.repository.PedidoRepository;
import br.com.gestaojato.service.PedidoService;
import br.com.gestaojato.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> findById(String id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public Pedido criar(Pedido pedido) {
        pedido.setStatus(Status.AGUARDANDO_ATENDIMENTO);
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido atualizar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

}
