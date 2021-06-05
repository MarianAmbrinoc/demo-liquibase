package com.liquibase.demoliquibase.service;

import com.liquibase.demoliquibase.model.User;
import com.liquibase.demoliquibase.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> findById(Long userId) {
        log.info("service - getUser");
        return userRepository.findById(userId);
    }

    public List<User> findAll() {
        log.info("service - getUserList");
        return userRepository.findAll();
    }

    public User save(User user) {
        log.info("service - save");
        return userRepository.save(user);
    }


}
