package com.example.pagination.controller;

import com.example.pagination.dto.PaginationRequest;
import com.example.pagination.model.User;
import com.example.pagination.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4201", allowedHeaders = "*")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/paged")
    public ResponseEntity<Page<User>> getAll(@RequestBody PaginationRequest request) {
        return userService.getAllUsers(request);
    }

}
