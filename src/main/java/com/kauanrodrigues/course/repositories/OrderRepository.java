package com.kauanrodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauanrodrigues.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
