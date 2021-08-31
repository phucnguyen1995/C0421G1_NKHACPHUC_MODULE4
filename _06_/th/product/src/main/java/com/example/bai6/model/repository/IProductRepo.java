package com.example.bai6.model.repository;

import ch.qos.logback.core.boolex.EvaluationException;
import com.example.bai6.model.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepo extends JpaRepository<Product, Integer> {

    List<Product>findByName(String name);








}
