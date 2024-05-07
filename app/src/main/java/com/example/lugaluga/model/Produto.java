package com.example.lugaluga.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Produto implements Parcelable {
    private String nome;
    private double preco;
    private String marca;
    private int quantidade;
    private String status;
    private String descricao;
    public Produto(){

    }

    public Produto(String nome, double preco, String marca, int quantidade, String status, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.quantidade = quantidade;
        this.status = status;
        this.descricao = descricao;
    }

    protected Produto(Parcel in) {
        nome = in.readString();
        preco = in.readDouble();
        marca = in.readString();
        quantidade = in.readInt();
        status = in.readString();
        descricao = in.readString();
    }

    public static final Creator<Produto> CREATOR = new Creator<Produto>() {
        @Override
        public Produto createFromParcel(Parcel in) {
            return new Produto(in);
        }

        @Override
        public Produto[] newArray(int size) {
            return new Produto[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeDouble(preco);
        dest.writeString(marca);
        dest.writeInt(quantidade);
        dest.writeString(status);
        dest.writeString(descricao);
    }


}
