package com.example.lugaluga.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.CalendarContract;

import androidx.annotation.NonNull;

import java.util.Date;

public class User implements Parcelable {

    private String nome;

    private String cpf;

    private String logradouro;

    private Date data;

    private int cep;

    private String cidade;

    private int numero;

    private String bairro;

    private String email;

    private String password;

    protected User(Parcel in){
        nome = in.readString();
        cpf = in.readString();
        logradouro = in.readString();
        cep = in.readInt();
        cidade = in.readString();
        numero = in.readInt();
        bairro = in.readString();
        email = in.readString();
        password = in.readString();
    }

    public void witeToParcel(Parcel dest, int flags){
        dest.writeString(nome);
        dest.writeString(cpf);
        dest.writeString(logradouro);
        dest.writeInt(cep);
        dest.writeString(cidade);
        dest.writeInt(numero);
        dest.writeString(bairro);
        dest.writeString(email);
        dest.writeString(password);

    }


    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(cpf);
        dest.writeString(logradouro);
        dest.writeInt(cep);
        dest.writeString(cidade);
        dest.writeInt(numero);
        dest.writeString(bairro);
        dest.writeString(email);
        dest.writeString(password);
    }

    public User(String nome, String cpf, String logradouro, Date data, int cep, String cidade, int numero, String bairro, String email, String password) {
        this.nome = nome;
        this.cpf = cpf;
        this.logradouro = logradouro;
        this.data = data;
        this.cep = cep;
        this.cidade = cidade;
        this.numero = numero;
        this.bairro = bairro;
        this.email = email;
        this.password = password;
    }
}
