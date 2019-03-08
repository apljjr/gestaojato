package br.com.gestaojato.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Pedido {

    @Id
    private String id;
    private Cliente cliente;
    private List<Produto> produtos;
    private Date data;
    private Double desconto;
    private String status;

    public Pedido () {}

    public Pedido(Cliente cliente, List<Produto> produtos, Date data, Double desconto) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.data = data;
        this.desconto = desconto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
