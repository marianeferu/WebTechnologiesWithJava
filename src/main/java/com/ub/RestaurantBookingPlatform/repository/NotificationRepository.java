package com.ub.RestaurantBookingPlatform.repository;

import com.ub.RestaurantBookingPlatform.model.Notification;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class NotificationRepository {

    private List<Notification> notifications = new ArrayList<>();


    private Notification save(Notification notification){

        notifications.add(notification);
        return notification;
    }

    private List<Notification> getAll(){

        return notifications;
    }

    private Notification delete(Notification notification){

        notifications.remove(notification);
        return notification;
    }









}
