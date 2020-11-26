package com.ub.RestaurantBookingPlatform.model;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class Reservation {

    private User user;
    private Date date; //+time
    private Integer num_persons;
    private Menu details_menu;



}
