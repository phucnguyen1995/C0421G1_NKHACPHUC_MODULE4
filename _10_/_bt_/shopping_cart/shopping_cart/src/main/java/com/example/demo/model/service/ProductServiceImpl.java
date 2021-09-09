package com.example.demo.model.service;

import com.example.demo.model.entity.Product;
import com.example.demo.model.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepo iProductRepo;

    @Override
    public List<Product> findAll() {
        return this.iProductRepo.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.iProductRepo.findById(id);
    }

    @Override
    public void save(Product product) {
        this.iProductRepo.save(product);
    }
}
