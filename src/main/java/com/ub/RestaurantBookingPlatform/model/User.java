package com.ub.RestaurantBookingPlatform.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
/*@Setter
@AllArgsConstructor
@NoArgsConstructor*/
@Builder
public class User {


    private String username;
    private String description;
    private Reservation reservation_user;
    private List<Reservation> history_reservation;
    private boolean user_role; // 0 - client user, 1 - employee

}
