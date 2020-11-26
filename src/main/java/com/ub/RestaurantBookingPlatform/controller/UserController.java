package com.ub.RestaurantBookingPlatform.controller;


import com.ub.RestaurantBookingPlatform.dto.UserDto;
import com.ub.RestaurantBookingPlatform.model.User;
import com.ub.RestaurantBookingPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController  //end points a json/html/xml
//entry point of our request
@RequestMapping("/user") //get path

public class UserController {

   /* @RequestMapping(value = "/test/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(@PathVariable("name") String name){

        return "Hello from " + name;


       //http://localhost:8081/user/test/ina
*/

/*    @RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(@RequestParam String name){

        return "Hello from " + name;

        //http://localhost:8081/user/test?name=ina


    }*/

    @Autowired //inject beans in another bean through constructs/setters/autowired
    private UserService userService;


    //if we have more get mehods we will need to add value="" : to differentiate the requests
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)  //when it gets on the url(/user), will call this method
    public List<UserDto> getAll(){

        return userService.getAll();
    }

    //add user -> post request
    @PostMapping(consumes =  MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDto create(@RequestBody UserDto userDto){

    return userService.save(userDto);

    }


    //delete user -> delete request
    @DeleteMapping(value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE )
    public String remove(@PathVariable("name") String name){
        boolean result = userService.delete(name);

        return result ? String.format("User %s removed", name)
                : String.format("User %s was not removed", name);

    }


}
