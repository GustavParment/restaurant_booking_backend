package com.gustav.restaurant_booking_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantDTO {
    @Id
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String description;
    private String image;

}
