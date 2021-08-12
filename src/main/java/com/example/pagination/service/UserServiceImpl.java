package com.example.pagination.service;

import com.example.pagination.dto.PaginationRequest;
import com.example.pagination.model.User;
import com.example.pagination.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity<Page<User>> getAllUsers(PaginationRequest request) {
        if (request.getPage() != null) {
            Pageable page = PageRequest.of(request.getPage(), request.getItems() != null ? request.getItems() : 10);
            Page<User> result = userRepository.findAll(page);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
