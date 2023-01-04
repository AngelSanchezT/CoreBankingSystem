package com.angelsanchezt.banking.core.administration.web.controller;

import com.angelsanchezt.banking.core.administration.domain.service.UserService;
import com.angelsanchezt.banking.core.administration.persistence.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{userName}")
    @Operation(summary = "Search a user with an user_name")
    @ApiResponse(responseCode = "200", description = "OK")
    public ResponseEntity<User> getBusinessById(
        @Parameter(name = "The user_name of the user", required = true, example = "user")
        @PathVariable("userName") String userName) {
        return userService.getUser(userName).map(user  -> new ResponseEntity<>(user, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    public ResponseEntity<User> save(@RequestBody User user) {
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/{userName}")
    public ResponseEntity delete(@PathVariable("userName") String userName) {
        if (userService.delete(userName)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
