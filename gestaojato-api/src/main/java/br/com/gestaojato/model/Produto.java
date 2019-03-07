package br.com.gestaojato.model;

import org.springframework.data.annotation.Id;

import java.time.Duration;

public class Produto {

    @Id
    private String id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer tempoGastoMin;

    public Produto(String nome, String descricao, Double preco, Integer tempoGastoMin) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tempoGastoMin = tempoGastoMin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
