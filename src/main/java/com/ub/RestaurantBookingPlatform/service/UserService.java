package com.ub.RestaurantBookingPlatform.service;

import com.ub.RestaurantBookingPlatform.dto.UserDto;
import com.ub.RestaurantBookingPlatform.model.User;
import com.ub.RestaurantBookingPlatform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service //bean so I can access it from Spring Context (i can access it from contoller)
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto save(UserDto userDto){

        User user =  mapToEntity(userDto);
        User savedUser = userRepository.save(user);
        return mapToDto(savedUser);

    }

    public List<UserDto> getAll(){

        return userRepository.getAll()
                .stream()
                .map(user -> mapToDto(user))//response: json
                .collect(Collectors.toList());
    }




    public boolean delete(String name){

        Optional<User> optionalUser = userRepository.getAll()
                                                    .stream()
                                                    .filter(user -> user.getUsername().equals(name))
                                                    .findAny();

        if(optionalUser.isPresent())
        {
            userRepository.delete(optionalUser.get());
            return true;
        }
        else
            return false;
    }

    private UserDto mapToDto(User user) {
        return UserDto.builder()
                .username(user.getUsername())
                .additional_info(user.getDescription())
                .build();
    }

    private User mapToEntity(UserDto userDto) {
        return User.builder()
                .username(userDto.getUsername())
                .description("Saved user")
                .build();
    }

}
