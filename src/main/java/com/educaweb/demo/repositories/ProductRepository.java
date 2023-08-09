package com.educaweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.demo.entities.Category;
import com.educaweb.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{ 	

}
