package com.ub.RestaurantBookingPlatform.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class Feedback {

    private Reservation reservation;
    private User user_feedback;
    private String comment;
    private Integer stars; // out of 5

}
