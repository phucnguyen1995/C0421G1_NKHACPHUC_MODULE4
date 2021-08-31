package com.example.bai6.model.service;

import com.example.bai6.model.bean.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    public List<Product> findAll();
    public void save(Product product);
    public void delete(int id);
    List<Product>findByName(String name);


    public Optional<Product> viewProduct(int id);

    Product viewP(int id);
//    List<Product>findByNameMore(String name,double price1,double price2);

}
