package com.qovery.billing;

/**
 * Created by evoxmusic on 02/12/2019.
 */
public class Invoice {

    private Float amount;
    private String currency;
    private String item;

    public Invoice() {
    }

    public Invoice(Float amount, String currency, String item) {
        this.amount = amount;
        this.currency = currency;
        this.item = item;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
