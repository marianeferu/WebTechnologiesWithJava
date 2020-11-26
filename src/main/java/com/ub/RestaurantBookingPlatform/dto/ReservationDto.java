package com.ub.RestaurantBookingPlatform.dto;

import com.ub.RestaurantBookingPlatform.model.Payment;
import com.ub.RestaurantBookingPlatform.model.Table;
import com.ub.RestaurantBookingPlatform.model.User;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder

//what to expose
public class ReservationDto {

    private User user;
    private Date date;
    private Table table;
    private Payment payment_method;
    private boolean confirmed_reserv;


}
