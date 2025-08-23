package com.exemplo.springboot_jpa_workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.springboot_jpa_workshop.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
