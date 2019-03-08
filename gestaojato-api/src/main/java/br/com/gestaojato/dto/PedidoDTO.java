package br.com.gestaojato.dto;

import br.com.gestaojato.model.Cliente;
import br.com.gestaojato.model.Pedido;
import br.com.gestaojato.model.Produto;

import java.util.Date;
import java.util.List;

public class PedidoDTO {

    private Cliente cliente;
    private List<Produto> produtos;
    private Date data;
    private Double desconto;

    public PedidoDTO() {}

    public PedidoDTO(Cliente cliente, List<Produto> produtos, Date data, Double desconto) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.data = data;
        this.desconto = desconto;
    }

    public Pedido transformaParaObjeto() { return new Pedido(cliente, produtos, data, desconto);}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
