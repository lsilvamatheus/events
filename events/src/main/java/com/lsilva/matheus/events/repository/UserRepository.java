package com.lsilva.matheus.events.repository;

import com.lsilva.matheus.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Integer> {
    
}
