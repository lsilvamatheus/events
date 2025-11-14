package com.lsilva.matheus.events.repository;

import com.lsilva.matheus.events.model.Subscription;
import com.lsilva.matheus.events.model.SubscriptionID;
import org.springframework.data.repository.ListCrudRepository;

public interface SubscriptionRepository extends ListCrudRepository<Subscription, SubscriptionID> {
    
}
