package com.example.nxttrendz2.repository;

import java.util.*;
import com.example.nxttrendz2.model.Category;
import com.example.nxttrendz2.model.Product;

public interface ProductRepository {
    ArrayList<Product> getProducts();

    Product getProductById(int productId);

    Product addProduct(Product product);

    Product updateProduct(int productId, Product product);

    void deleteProduct(int productId);

    Category getProductCategory(int productId);
}