package com.example.codejava_springboot_firstapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {
    @Autowired
    private ProductService service;
    @RequestMapping({"/homepage","/"})
    public String homepapge(Model model){

        model.addAttribute("products",service.getAllProduct());
        return "homepage";
    }

    @GetMapping("/add-product")
    public String AddProduct_Get(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        return "addproduct";
    }
    @PostMapping("/add-product")
    public String AddProduct_Post( @ModelAttribute("product") Product product){
        service.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String EditProduct(Model model,@PathVariable Long id){

        model.addAttribute("product",  service.findProductById(id));
        return "editproduct";
    }

    @GetMapping("/delete/{id}")
    public String Delete(Model model,@PathVariable Long id){

        service.deleteProduct(id);
        return "redirect:/";
    }
//    @GetMapping("/edit/{id}")
//    public String EditProduct(Model model,@PathVariable Long id){
//
//        model.addAttribute("product",  service.findProductById(id));
//        return "editproduct";
//    }


}
