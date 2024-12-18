package com.example.dummyjson.client;

import com.example.dummyjson.dto.Product;
import com.example.dummyjson.dto.ProductWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "product", url = "${dummy.url}")
public interface ProductClient {

    @GetMapping
    ProductWrapper getProducts();

    @GetMapping(value = "/{id}")
    Product getProductById(@PathVariable Long id);
}
