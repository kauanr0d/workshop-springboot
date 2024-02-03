package com.kauanrodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauanrodrigues.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

} 
