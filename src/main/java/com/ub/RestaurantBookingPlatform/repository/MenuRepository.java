package com.ub.RestaurantBookingPlatform.repository;

import com.ub.RestaurantBookingPlatform.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class MenuRepository {

    private List<Menu> menus = new ArrayList<>();

    private Menu save(Menu menu){

        menus.add(menu);
        return menu;
    }

    private List<Menu> getAll(){

        return menus;
    }

    private Menu delete(Menu menu){

        menus.remove(menu);
        return menu;
    }

}