package com.springer.SimpleWebApplication.service;

import com.springer.SimpleWebApplication.model.Product;
import com.springer.SimpleWebApplication.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class productService {

    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",10000),
//            new Product(200,"Mushroom",200),
//            new Product(300,"Movie castte",160)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductsbyId(int prodid) {
        return repo.findById(prodid).orElse(new Product());
    }

    public void addProducts(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodid) {
        repo.deleteById(prodid);

    }
}
