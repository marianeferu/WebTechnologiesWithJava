package com.ub.RestaurantBookingPlatform.repository;

import com.ub.RestaurantBookingPlatform.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository  // =>bean => in spring context

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() { //constructor cause it's a bean
        loadData();
    }


    public User save(User user){

        users.add(user);
        return user;

    }

    public List<User> getAll(){
        return users;
    }

    public void delete (User user){

        users.remove(user);

    }

    private void loadData() {
        User user1 = User.builder()
                .username("Ioan Silvescu")
                .build();

        users.add(user1);

        User user2 = User.builder()
                .username("Maria Neferu")
                .build();

        users.add(user2);
    }


}
