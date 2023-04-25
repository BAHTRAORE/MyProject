package org.example.entity;

public class Invoice {

    //chacunes de mes factures aura un numero du nom de la facture
    private String number;

    //le nom du client
    private String custumerName;

    //generer les getters et setters
    public String getCustumerName() {
        return custumerName;
    }

    public void setCustumerName(String custumerName) {
        this.custumerName = custumerName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
