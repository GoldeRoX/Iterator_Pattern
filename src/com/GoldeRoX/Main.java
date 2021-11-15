package com.GoldeRoX;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {



        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product("PRODUCT1", new BigDecimal("100")));
        productCollection.add(new Product("PRODUCT2", new BigDecimal("200")));
        productCollection.add(new Product("PRODUCT3", new BigDecimal("300")));
        productCollection.add(new Product("PRODUCT4", new BigDecimal("400")));
        productCollection.remove(new Product("PRODUCT4", new BigDecimal("400")));


        MyIterator<Product> iterator = productCollection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
