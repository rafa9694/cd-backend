package com.rafadev.cdbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafadev.cdbackend.entities.User;
import com.rafadev.cdbackend.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User getByEmail(String email) {
		return repository.getByEmail(email);
	}

}
