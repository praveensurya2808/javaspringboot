package com.springer.SimpleWebApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Entity
public class Product {
    @Id
    private Integer productId;
    private String productName;
    private Integer price;
    private boolean available;

    public Product() {}

    public Product(int productId, String productName, int price,boolean available) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.available=available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
