package com.ub.RestaurantBookingPlatform.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//what to expose

@Getter
/*@Setter
@AllArgsConstructor
@NoArgsConstructor*/
@Builder
public class UserDto {

    private String username;
    private String additional_info;
    private boolean user_role; // 0 - client user, 1 - employee




}
