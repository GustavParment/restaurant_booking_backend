package com.gustav.restaurant_booking_backend.authorities;

import lombok.Getter;

@Getter
public enum UserPermission {

    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE");

    private final String permission;

    UserPermission(String permission) {
        this.permission = permission;
    }


}