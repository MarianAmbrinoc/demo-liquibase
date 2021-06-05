package com.liquibase.demoliquibase.controller;

import com.liquibase.demoliquibase.model.User;
import com.liquibase.demoliquibase.repository.UserRepository;
import com.liquibase.demoliquibase.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long userId) {
        log.info("getUser");
        return ResponseEntity.of(userService.findById(userId));
    }

    @RequestMapping("/getAll")
    public List<User> getUserList() {
        log.info("getUserList");
        return userService.findAll();
    }

}