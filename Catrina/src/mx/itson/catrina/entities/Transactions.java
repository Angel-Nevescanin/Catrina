/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import java.util.Date;

/**
 *
 * @author angel
 */
public class Transactions {
 
    //las clases de transactions con sus get and set
    private Date Date;
    private String description;
    private int amount;
    private Boolean Type;
    private float deposito;
    private float retiro;
    private float subtotal;

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Boolean getType() {
        return Type;
    }

    public void setType(Boolean Type) {
        this.Type = Type;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public float getRetiro() {
        return retiro;
    }

    public void setRetiro(float retiro) {
        this.retiro = retiro;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

}


