package com.example.codejava_springboot_firstapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    List<Product> getAllProduct(){
        return repository.findAll();
    }
}
