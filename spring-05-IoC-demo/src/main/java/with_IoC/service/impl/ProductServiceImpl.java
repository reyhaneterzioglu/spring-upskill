package with_IoC.service.impl;

import with_IoC.model.Product;
import with_IoC.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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

//        for (Product product : productDatabase) {
//
//            if (product.getId() == productId) return product;
//
//        }
//
//        return null;
    }
}