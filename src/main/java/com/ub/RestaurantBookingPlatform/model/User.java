package com.ub.RestaurantBookingPlatform.model;

import lombok.Builder;
import lombok.Getter;

@Getter
/*@Setter
@AllArgsConstructor
@NoArgsConstructor*/
@Builder
public class User {


    private String username;
    private String description;


}
