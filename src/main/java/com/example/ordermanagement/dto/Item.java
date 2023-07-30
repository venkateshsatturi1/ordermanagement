package com.example.ordermanagement.dto;

class Item {
    private String product_id;
    private int quantity;

    // Constructor, getters, and setters
    // (You can generate them automatically in most IDEs)

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}