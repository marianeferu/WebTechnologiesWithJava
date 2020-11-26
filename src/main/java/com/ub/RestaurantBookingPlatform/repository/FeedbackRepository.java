package com.ub.RestaurantBookingPlatform.repository;

import com.ub.RestaurantBookingPlatform.model.Feedback;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class FeedbackRepository {

    private List<Feedback> feedbacks = new ArrayList<>();

    private Feedback save(Feedback feedback){

        feedbacks.add(feedback);
        return feedback;
    }

    private List<Feedback> getAll(){

        return feedbacks;
    }

    private Feedback delete(Feedback feedback){

        feedbacks.remove(feedback);
        return feedback;
    }


}
