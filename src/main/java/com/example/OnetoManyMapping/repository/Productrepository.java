package com.example.OnetoManyMapping.repository;

import com.example.OnetoManyMapping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepository extends JpaRepository<Product,Integer> {
}
