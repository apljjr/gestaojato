package br.com.gestaojato.dto;

import br.com.gestaojato.model.Cliente;

public class ClienteDTO {

    private String nome;
    private String sobrenome;
    private String nascimento;
    private String cep;
    private String logradouro;

    public ClienteDTO () {}


    public ClienteDTO(String nome, String sobrenome, String nascimento, String cep, String logradouro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
        this.cep = cep;
        this.logradouro = logradouro;
    }

    public Cliente transformaParaObjeto() {
        return new Cliente(nome, sobrenome, nascimento, cep, logradouro);
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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
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
}
