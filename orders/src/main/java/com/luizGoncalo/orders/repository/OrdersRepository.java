package com.luizGoncalo.orders.repository;

import com.luizGoncalo.orders.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
