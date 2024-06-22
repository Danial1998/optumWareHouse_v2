package com.optumwarehousev2.order_service.repository;

import com.optumwarehousev2.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
