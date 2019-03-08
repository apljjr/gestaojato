package br.com.gestaojato.dto;

import br.com.gestaojato.model.Produto;

public class ProdutoDTO {

    private String nome;
    private String descricao;
    private Double preco;
    private Integer tempoGastoMin;

    public ProdutoDTO() {}

    public ProdutoDTO(String nome, String descricao, Double preco, Integer tempoGastoMin) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tempoGastoMin = tempoGastoMin;
    }

    public Produto transformaParaObjeto() {return new Produto(nome, descricao, preco, tempoGastoMin);}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getTempoGastoMin() {
        return tempoGastoMin;
    }

    public void setTempoGastoMin(Integer tempoGastoMin) {
        this.tempoGastoMin = tempoGastoMin;
    }
}
