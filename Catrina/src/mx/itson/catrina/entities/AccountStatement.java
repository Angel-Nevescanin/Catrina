/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
public class AccountStatement {
    
    //se declara las clases con sus get and set
    private int account;
    private int clabe;
    private String currency;
    private Customer customer;
    private List<Transactions> transactions;
    private List<Transactions> transactionsesOp;

    public int getAccount() {
        return account;
    }

    public void setAccount(int Account) {
        this.account = Account;
    }

    public int getClabe() {
        return clabe;
    }

    public void setClabe(int Clabe) {
        this.clabe = Clabe;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String Currency) {
        this.currency = Currency;
    }
    
    public AccountStatement deserialize(String json){
        AccountStatement recipe = new AccountStatement();
        try {
            recipe = new Gson().fromJson(json, AccountStatement.class);
        }catch(Exception ex){
            System.err.println("Ocurrio un error: " +ex.getMessage());
        }
        return recipe;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer Customer) {
        this.customer = Customer;
    
    }


    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    public List<Transactions> getTransactionsesOp() {
        return transactionsesOp;
    }

    public void setTransactionsesOp(List<Transactions> transactionsesOp) {
        this.transactionsesOp = transactionsesOp;
    }
    
}
