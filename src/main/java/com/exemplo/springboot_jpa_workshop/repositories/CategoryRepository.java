package com.exemplo.springboot_jpa_workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.springboot_jpa_workshop.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
