package com.app.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.entity.Order;
import com.app.main.model.OrderRequest;
import com.app.main.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/home")
	public String orderHomePage() {
		return "Welcome to OrderPage";
	}
	
	@GetMapping("/getAll")
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
		
	}
	
	@PostMapping("/placeOrder")
	public ResponseEntity<Integer> placecOrder(@RequestBody OrderRequest orderRequest){
		int orderId=orderService.placeOrder(orderRequest);
		return new ResponseEntity<Integer>(orderId, HttpStatus.OK);
		
	}

}
