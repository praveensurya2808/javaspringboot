package com.springer.SimpleWebApplication.controller;

import com.springer.SimpleWebApplication.model.Product;
import com.springer.SimpleWebApplication.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {

        @Autowired
        productService service;

        @GetMapping("/product")
        public List<Product> currentProducts(){
            return service.getProducts();
    }
        @GetMapping("/product/{prodid}")
        public Product getProductbyId(@PathVariable int prodid){
            return service.getProductsbyId(prodid);
        }

        @PostMapping("/products")
        public void addProducts(@RequestBody Product prod){

            service.addProducts(prod);


        }
        @PutMapping ("/products")
        public void updateProduct(@RequestBody Product prod){
            service.updateProduct(prod);
        }

        @DeleteMapping("/product/{prodid}")
        public void deleteProduct(@PathVariable int prodid){
            service.deleteProduct(prodid);
        }

}
