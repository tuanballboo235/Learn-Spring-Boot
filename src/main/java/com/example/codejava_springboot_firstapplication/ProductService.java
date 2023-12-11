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

    public void saveProduct(Product product){
        repository.save(product);
    }



    public Product findProductById(Long id){
        return repository.findById(id).get();
    }

    public void deleteProduct(Long id){
        repository.deleteById(id);
    }

}
