package com.projetogrupo05.projetogrupo05.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_conta")
public class AccountBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero")
    private long numero;

    @Column(name = "agencia")
    private int agencia;

    @Column(name = "saldo")
    private double saldo;

    @Column(name = "tipo")
    private int tipoAccount;

    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    @JsonIgnoreProperties("contas") // Buscar o cliente não traga novamente as contas
    private Client titular;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Client getTitular() {
        return titular;
    }

    public void setTitular(Client titular) {
        this.titular = titular;
    }

    public int getTipoConta() {
        return tipoAccount;
    }

    public void setTipoConta(int tipoAccount) {
        this.tipoAccount = tipoAccount;
    }
}