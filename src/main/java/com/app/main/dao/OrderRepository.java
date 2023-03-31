package com.app.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.main.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
