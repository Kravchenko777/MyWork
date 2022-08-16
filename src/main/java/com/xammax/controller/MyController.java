package com.xammax.controller;


import com.xammax.entity.UserPOJO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MyController {

    List<UserPOJO> userPOJOList = new ArrayList<>();

    public MyController(){
        userPOJOList.addAll(List.of(new UserPOJO("1","2","3"),
                new UserPOJO("1","2","3"),
                new UserPOJO("1","2","3"),
                new UserPOJO("1","2","3"),
                new UserPOJO("1","2","3")));
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<UserPOJO>> getSend(){
        return new ResponseEntity<>(userPOJOList, HttpStatus.OK);
    }

    @GetMapping(value = "/list/{id}")
    public Optional<UserPOJO> getSendById(@PathVariable String id){
        return userPOJOList
                .stream()
                .filter(userPOJO -> userPOJO.getId().equals(id))
                .findFirst();
    }
}
