package com.example.ordermanagement.dto;



class PaymentMethod {
    private String method;
    private String card_number;
    private String expiry_date;
    private String cvv;

    // Constructor, getters, and setters
    // (You can generate them automatically in most IDEs)

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}