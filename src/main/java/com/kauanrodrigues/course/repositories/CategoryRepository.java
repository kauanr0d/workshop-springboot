package com.kauanrodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauanrodrigues.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
