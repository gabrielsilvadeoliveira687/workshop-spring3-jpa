package com.educaweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{ 	

}
