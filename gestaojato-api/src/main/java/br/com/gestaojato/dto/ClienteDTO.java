package br.com.gestaojato.dto;

import br.com.gestaojato.model.Cliente;

import java.util.Date;

public class ClienteDTO {

    private String nome;
    private String sobrenome;
    private Date nascimento;
    private String cep;
    private String logradouro;
    private String contato;

    public ClienteDTO () {}

    public ClienteDTO(String nome, String sobrenome, Date nascimento, String cep, String logradouro, String contato) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
        this.cep = cep;
        this.logradouro = logradouro;
        this.contato = contato;
    }

    public Cliente transformaParaObjeto() {
        return new Cliente(nome, sobrenome, nascimento, cep, logradouro, contato);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
