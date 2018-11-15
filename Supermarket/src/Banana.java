package com.supermarket.siit;

public class Banana extends Product {

    public Banana(int id, String unitOfMeasure, double price, double quantity, String category) {
        super(id, unitOfMeasure, price, quantity, category);
    }

    @Override
    public String toString() {
        return "Banana " + super.toString();
    }
}
