package com.ub.RestaurantBookingPlatform.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class Menu {

    private String name;
    private Integer starting_price; // 0 for normal booking, 100 for an all inclusive event

}
