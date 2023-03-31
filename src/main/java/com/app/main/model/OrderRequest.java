package com.app.main.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder 
public class OrderRequest { 
	private int productId;
	private double totalAmount;
	private int quantity;
	private PaymentMode paymentMode;
	

}
