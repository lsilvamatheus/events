package com.lsilva.matheus.events.repository;

import com.lsilva.matheus.events.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepository extends ListCrudRepository<Session, Integer> {
    
}
