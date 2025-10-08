package com.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.model.User;
import com.task.repository.UserRepository;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;

    public String getUserNameById(Long id) {
        return userRepository.findById(id)
                .map(User::getName)
                .orElse("Unknown");
    }

}
