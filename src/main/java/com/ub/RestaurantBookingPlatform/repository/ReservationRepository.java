package com.ub.RestaurantBookingPlatform.repository;

import com.ub.RestaurantBookingPlatform.model.Reservation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class ReservationRepository {

    private List<Reservation> reservations = new ArrayList<>();

    public Reservation save(Reservation reservation){

        reservations.add(reservation);
        return  reservation;
    }

    private List<Reservation> getAll(){

        return  reservations;
    }

    private Reservation delete(Reservation reservation){

        reservations.remove(reservation);
        return reservation;
    }


    private Reservation confirmed_reserv(Reservation reservation){

        return reservation;  //boolean
    }

}
