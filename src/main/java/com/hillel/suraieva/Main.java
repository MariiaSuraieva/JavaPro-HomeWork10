package com.hillel.suraieva;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {

    static Map<Product, Company> products = new HashMap<>();

    public static void main(String[] args) throws Exception {

        Product product1 = new Product("Iphone");
        Product product2 = new Product("Samsung A2");

        Company company1 = new Company("Apple");
        Company company2 = new Company("Samsung");

        Company company3 = new Company("Tesla");

        products.put(product1, company1);
        products.put(product2, company2);


        System.out.println(addProduct("Iphone").get());
        System.out.println(checkCompany(company1).get());
        System.out.println(checkCompany(company3).get());
        System.out.println(checkCompany(company2).get());
        System.out.println(deleteByCompany(product1).get());
    }

    public static Optional<Boolean> checkCompany(Company company) {
        return Optional.of(products.containsValue(company));
    }

    public static Optional<Product> addProduct(String name) {
        Product product = new Product(name);
        return Optional.ofNullable(product);
    }

    public static Optional<Map<Product, Company>> deleteByCompany(Product product) {
        products.remove(product);
        return Optional.ofNullable(products);
    }


}
