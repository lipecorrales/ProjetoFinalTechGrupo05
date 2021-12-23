package com.projetogrupo05.projetogrupo05.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Client {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long cod;

    @Column(name = "cpf", length = 11, nullable = false , unique = true)
    // unique = não pode ter 2 cpfs iguais
    private double cpf;

    @Column(name = "email", length = 100, nullable = false, unique = true)    
    private String email;

    @Column(name = "nome", length = 200, nullable = false)
    private String name; 

    @Column(name = "telefone", length = 20, nullable = false)
    private String telephone;

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    } 

    
    

}
