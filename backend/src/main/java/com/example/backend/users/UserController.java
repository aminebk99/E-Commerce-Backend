package com.example.backend.users;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public User saveUsers(@RequestBody User user){
        return userService.saveUSers(user);
    }
    @GetMapping
    public List<User> listOfUsers(){
        return userService.listOfUSers();
    }
    @GetMapping("/{id}")
    public Optional<User> finduserById(@PathVariable Long id){
        return userService.findUserById(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteuserById(@PathVariable Long id){
        userService.deleteUsers(id);
    }
}
