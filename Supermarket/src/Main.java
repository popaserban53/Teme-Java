package com.supermarket.siit;

import static com.supermarket.siit.CommonStrings.*;

public class Main {

    public static void main(String[] args) {

        // supermarket side
        Supermarket supermarket = new Cora();

        // id, unitOfMeasure, price, quantity
        Product bananas = new Banana(1, UNIT_OF_MEASURE_KG, 3, 100, PRODUCT_CATEGORY_FRUITS);

        Product apples = new Apple(2, UNIT_OF_MEASURE_KG, 2, 200, PRODUCT_CATEGORY_FRUITS);

        Product potatoes = new Potato(3, UNIT_OF_MEASURE_KG, 1, 500, PRODUCT_CATEGORY_VEGETABLE);
        // product, quantity, adaos
        supermarket.addStock(bananas,300);
        supermarket.addStock(apples, 100);
        supermarket.addStock(potatoes, 50);

        // id, quantity
       supermarket.deleteStock(1, 50);

       supermarket.listStock();


        // -----

        // client side
        Product[] products = supermarket.listProducts(PRODUCT_CATEGORY_FRUITS);
        Cart cart = new Cart();
        double quantity = 1;
        cart.addProduct(products[0], quantity);
        System.out.println(products[0].getQuantity());
        System.out.println(quantity);
        cart.printStatus();

//        cart.checkout();


    }
}
