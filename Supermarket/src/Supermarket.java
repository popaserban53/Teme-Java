package com.supermarket.siit;

public interface Supermarket {

    void addStock(Product product, double adaos);

    void deleteStock(int id, double quantity);

    Product[] listProducts(String category);

    void listStock();

//    default void defaultBehaviorExeample() {
//    }
}
