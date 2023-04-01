package com.app.main.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "product-service/product")
public interface ProductService {
	
	@PutMapping("/reduseQuantity/{id}")
	public ResponseEntity<Void>  reduseQuantity(@PathVariable("id") int productId,
			@RequestParam int quantity);

}
