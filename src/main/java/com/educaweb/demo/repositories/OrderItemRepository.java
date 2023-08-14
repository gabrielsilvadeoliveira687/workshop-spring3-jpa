package com.educaweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.demo.entities.OrderItem;
import com.educaweb.demo.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{ 	

}
