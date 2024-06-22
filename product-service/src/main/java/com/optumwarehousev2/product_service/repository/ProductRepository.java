package com.optumwarehousev2.product_service.repository;

import com.optumwarehousev2.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
