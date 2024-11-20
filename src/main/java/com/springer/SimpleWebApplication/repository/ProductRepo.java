package com.springer.SimpleWebApplication.repository;

import com.springer.SimpleWebApplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product , Integer> {


}
