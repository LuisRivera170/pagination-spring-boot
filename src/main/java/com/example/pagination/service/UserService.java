package com.example.pagination.service;

import com.example.pagination.dto.PaginationRequest;
import com.example.pagination.model.User;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<Page<User>> getAllUsers(PaginationRequest request);

}
