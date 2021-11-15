package com.rafadev.cdbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafadev.cdbackend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User getByEmail(String email);
}
