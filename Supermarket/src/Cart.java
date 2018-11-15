package com.supermarket.siit;

public class Cart {

    private double minValue = 50;
    private ProductInCart[] products;
    int index;

    public Cart() {
        this.products = new ProductInCart[3];
        this.index = 0;
    }

    public void addProduct(Product product, double quantity) {
        product.setQuantity(5);
        quantity = 4;
        products[index] = new ProductInCart(product, quantity);
        index++;
    }

    public void printStatus() {

        System.out.println("STATUS");
        double sum = 0;

        for(ProductInCart productInCart: products) {
            if(productInCart!= null) {
                Product product = productInCart.getProduct();
                sum += product.getPrice() * productInCart.getQuantity();
                System.out.println(productInCart.getProduct() + " " + productInCart.getQuantity());
            }
        }

        if(sum < minValue) {
            System.out.println("The total cost must be at least  " + minValue + "but it's " + sum);
        }
    }

    // scade stocul
    // goleste cosul
    public void checkout() {

    }
}
