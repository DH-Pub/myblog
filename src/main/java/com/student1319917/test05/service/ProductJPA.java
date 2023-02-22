package com.student1319917.test05.service;

import com.student1319917.test05.models.Product;

import java.util.List;

public interface ProductJPA {
    public List<Product> findAll();
    public boolean deleteProduct(int id);
}
