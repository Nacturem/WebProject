package com.educandoweb.demo.repositories;

import com.educandoweb.demo.entities.Order;
import com.educandoweb.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
