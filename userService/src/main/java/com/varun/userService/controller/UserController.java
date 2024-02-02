package com.varun.userService.controller;

import com.varun.userService.dto.UserDto;
import com.varun.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserDto>> getAll(){
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }
}
