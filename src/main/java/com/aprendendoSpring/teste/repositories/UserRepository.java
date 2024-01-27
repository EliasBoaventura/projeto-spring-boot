package com.aprendendoSpring.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
