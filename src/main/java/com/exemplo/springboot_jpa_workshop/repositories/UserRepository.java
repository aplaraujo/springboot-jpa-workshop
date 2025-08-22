package com.exemplo.springboot_jpa_workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.springboot_jpa_workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
