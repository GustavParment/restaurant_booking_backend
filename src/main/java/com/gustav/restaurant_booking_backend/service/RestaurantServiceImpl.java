package com.gustav.restaurant_booking_backend.service;

import com.gustav.restaurant_booking_backend.dto.RestaurantDTO;
import com.gustav.restaurant_booking_backend.model.RestaurantEntity;
import com.gustav.restaurant_booking_backend.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public RestaurantEntity addRestaurant(RestaurantDTO restaurantDTO) {
        RestaurantEntity restaurantEntity = convertToEntity(restaurantDTO);

        return restaurantRepository.save(restaurantEntity);
    }

    @Override
    public RestaurantEntity updateRestaurant(RestaurantDTO restaurantDTO) {
        return null;
    }

    @Override
    public RestaurantEntity getRestaurantById(Long id) {
        return null;
    }

    @Override
    public List<RestaurantEntity> getAllRestaurants() {
        return List.of();
    }

    @Override
    public RestaurantEntity deleteRestaurant(Long id) {
        return null;
    }

    @Override
    public RestaurantDTO getRestaurantDTOById(Long id) {
        return null;
    }

    @Override
    public RestaurantEntity convertToEntity(RestaurantDTO dto) {
        return RestaurantEntity.builder()
                .name(dto.getName())
                .address(dto.getAddress())
                .phone(dto.getPhone())
                .description(dto.getDescription())
                .email(dto.getEmail())
                .description(dto.getDescription())
                .image(dto.getImage())
                .build();
    }
}
