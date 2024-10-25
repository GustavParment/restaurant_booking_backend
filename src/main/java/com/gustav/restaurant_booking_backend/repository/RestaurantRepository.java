package com.gustav.restaurant_booking_backend.repository;

import com.gustav.restaurant_booking_backend.model.RestaurantEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends MongoRepository<RestaurantEntity, Long> {
}
