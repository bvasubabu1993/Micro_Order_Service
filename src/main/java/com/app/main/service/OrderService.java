package com.app.main.service;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.main.dao.OrderRepository;
import com.app.main.entity.Order;
import com.app.main.model.OrderRequest;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> getAllOrders(){
		return orderRepository.findAll();
		
	}

	public int placeOrder(OrderRequest orderRequest) {
		Order order=Order.builder()
				.productId(orderRequest.getProductId())
				.quantity(orderRequest.getQuantity())
				.amount(orderRequest.getTotalAmount())
				.orderStatus("CREATED")
				.orderDate(Instant.now())
				.build();
		
		order=orderRepository.save(order);
		return order.getId();
	}

}
