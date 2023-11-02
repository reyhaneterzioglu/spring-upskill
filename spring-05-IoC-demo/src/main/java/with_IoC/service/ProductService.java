package with_IoC.service;

import with_IoC.model.Product;

import java.util.List;

public interface ProductService {

    void createProduct(Product product);

    List<Product> listAllProducts();

    Product findById(int productId);

}
