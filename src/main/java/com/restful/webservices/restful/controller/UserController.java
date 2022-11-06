package com.restful.webservices.restful.controller;

import com.restful.webservices.restful.models.User;
import com.restful.webservices.restful.services.UserNotFoundException;
import com.restful.webservices.restful.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserServices services;

    @GetMapping(path = "/users")
    public List<User> FindAllUsers(){
        return services.findAllUsers();
    }

    @GetMapping(path = "/users/{id}")
    public User FindUser(@PathVariable int id){
        User user = services.findOneUser(id);
        if(user==null){
         throw new UserNotFoundException("id not found "+id);
        }
        return services.findOneUser(id);
    }

    @PostMapping(path = "/adduser")
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user){
        services.save(user);
        URI location =  ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/users/{id}")
    public void delteUser(@PathVariable int id){
        User user = services.deleteUser(id);
        if(user==null){
            throw new UserNotFoundException("id not found "+id);
        }
    }
}
