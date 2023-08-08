package com.educaweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.demo.entities.Order;
import com.educaweb.demo.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long>{ 	

}
