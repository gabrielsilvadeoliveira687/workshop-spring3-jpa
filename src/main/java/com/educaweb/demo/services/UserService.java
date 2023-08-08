package com.educaweb.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.educaweb.demo.entities.User;
import com.educaweb.demo.repositories.UserRepository;


@Service
public class UserService {
	
		@Autowired	 
		private UserRepository repository;
		
		public List<User> findAll(){
			return repository.findAll();
	}

		 
		@GetMapping 	
		public User findById(Long id) {
		  Optional<User>obj= repository.findById(id);
		  return obj.get();
		}
}