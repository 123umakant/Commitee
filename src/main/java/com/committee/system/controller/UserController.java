package com.committee.system.controller;

import com.committee.system.dto.UserDTO;
import com.committee.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity registerMember(@ModelAttribute UserDTO userDTO)
    {
        userService.registerUser(userDTO);
        return new ResponseEntity("item created successfully",HttpStatus.CREATED);
    }
}
