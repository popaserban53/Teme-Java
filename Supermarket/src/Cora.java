package com.supermarket.siit;

public class Cora implements Supermarket {
    private int i;
    private ProductInStock[] products = null;

    public Cora() {
        this.i = 0;
        this.products = new ProductInStock[3];

    }

    @Override
    public void addStock(Product product, double addedValue) {
       ProductInStock productInStock = new ProductInStock(product, addedValue);
       products[i] = productInStock;
       i++;

    }

    @Override
    public void deleteStock(int id, double quantity) {
        for (int j = 0; j < 3; j++) {
            if (products[j] != null && products[j].getProduct().getId() == id) {
                Product product = products[j].getProduct();
                if (product.getQuantity() > quantity) {
                    product.setQuantity(product.getQuantity() - quantity);
                } else {
                    products[j] = null;
                }
            }
        }
    }

    @Override
    public Product[] listProducts(String category) {

        Product[] result = new Product[3];
        int i = 0;
        for(ProductInStock productInStock : products) {

            if(productInStock != null && productInStock.getProduct().getCategory().equals(category)) {
//                System.out.println(productInStock);
                result[i++] = productInStock.getProduct();
            }

//            if(productInStock !=null) {
//                Product product = productInStock.getProduct();
//                String  prodCategory = product.getCategory();
//
//                if(prodCategory.equals(category)) {
//                    result[i++] = productInStock.getProduct();
//                }
//            }
        }
        return result;
    }

    @Override
    public void listStock() {
        System.out.println("STOCK:");
        for (ProductInStock product : products) {
            if (product != null) {
                System.out.println(product.getProduct() + " " + product.getProduct().getQuantity());
            }
        }
    }
}
