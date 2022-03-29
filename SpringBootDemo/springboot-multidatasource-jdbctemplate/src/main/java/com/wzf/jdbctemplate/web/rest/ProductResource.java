package com.wzf.jdbctemplate.web.rest;

import com.wzf.jdbctemplate.entity.Product;
import com.wzf.jdbctemplate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductResource
 *
 */
@RestController
@RequestMapping("/api")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<Void> saveProduct(@RequestBody Product product) {
        productService.insertProduct(product);
        return ResponseEntity.ok().build();
    }

}
