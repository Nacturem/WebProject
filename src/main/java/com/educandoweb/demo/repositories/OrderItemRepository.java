package com.educandoweb.demo.repositories;

import com.educandoweb.demo.entities.OrderItem;
import com.educandoweb.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
