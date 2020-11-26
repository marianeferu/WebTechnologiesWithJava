package com.ub.RestaurantBookingPlatform.model;
import java.util.Date;


import lombok.Builder;
import lombok.Getter;


@Getter
@Builder

public class Notification {

    private String message;
    private Date date;
    private User user;


}
