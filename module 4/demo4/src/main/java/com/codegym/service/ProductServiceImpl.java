package com.codegym.service;

import com.codegym.model.Products;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Products> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Products> findById(int id) {
        return productRepository.findById(id);
    }
}
