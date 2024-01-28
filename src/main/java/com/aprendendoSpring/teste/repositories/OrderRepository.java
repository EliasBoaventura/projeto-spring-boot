package com.aprendendoSpring.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.teste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
