package com.lsilva.matheus.events.repository;

import com.lsilva.matheus.events.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepository extends ListCrudRepository<Conference, Integer> {

}
