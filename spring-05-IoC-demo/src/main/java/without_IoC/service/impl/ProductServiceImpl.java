package without_IoC.service.impl;

import without_IoC.model.Product;
import without_IoC.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    public static List<Product> productDatabase = new ArrayList<>();

    @Override
    public void createProduct(Product product) {
        product.setId(1);
        productDatabase.add(product);
    }

    @Override
    public List<Product> listAllProducts() {
        return productDatabase;
    }

    @Override
    public Product findById(int productId) {

        return productDatabase.stream().filter(product -> product.getId() == productId).findFirst().orElseThrow();
//
//        for (Product product : productDatabase) {
//
//            if (product.getId() == productId) return product;
//
//        }
//
//        return null;
    }
}