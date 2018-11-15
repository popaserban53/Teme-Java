package com.supermarket.siit;

public class Potato extends Product {

    public Potato(int id, String unitOfMeasure, double price, double quantity, String category) {
        super(id, unitOfMeasure, price, quantity, category);
    }


    @Override
    public String toString() {
        return "Potato " +  super.toString();
    }
}
