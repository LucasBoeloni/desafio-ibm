package com.example.dummyjson.service;

import com.example.dummyjson.client.ProductClient;
import com.example.dummyjson.dto.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductClient client;

    public List<Product> getAllProducts() {
        return client.getProducts().getProducts();
    }

    public Product getProductById(Long id) {
        return client.getProductById(id);
    }
}
