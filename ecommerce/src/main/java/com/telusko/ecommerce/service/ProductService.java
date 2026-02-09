package com.telusko.ecommerce.service;

import com.telusko.ecommerce.model.Product;
import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);

    Product getProductById(Long id);

}

