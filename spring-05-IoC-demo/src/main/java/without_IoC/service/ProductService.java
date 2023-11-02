package without_IoC.service;

import without_IoC.model.Product;

import java.util.List;

public interface ProductService {

    void createProduct(Product product);

    List<Product> listAllProducts();

    Product findById(int productId);

}
