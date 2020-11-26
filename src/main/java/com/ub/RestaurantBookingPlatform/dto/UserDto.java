package com.ub.RestaurantBookingPlatform.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
/*@Setter
@AllArgsConstructor
@NoArgsConstructor*/
@Builder
public class UserDto {

    private String username;
    private String additional_info;



}
