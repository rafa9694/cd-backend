package com.rafadev.cdbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafadev.cdbackend.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
