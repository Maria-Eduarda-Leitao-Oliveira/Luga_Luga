package com.example.lugaluga.model;

public class produto {
    private String nome;
    private double preco;
    private String marca;
    private int quantidade;
    private String status;
    private String descricao;
    public produto(){

    }

    public produto(String nome, double preco, String marca, int quantidade, String status, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.quantidade = quantidade;
        this.status = status;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
