package com.telusko.ecommerce.service;

import java.util.List;
import com.telusko.ecommerce.model.Product;

public interface ProductService {

    List<Product> getAllProducts();

    // new method
    Product getProductById(Long id);

    Product saveProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}
