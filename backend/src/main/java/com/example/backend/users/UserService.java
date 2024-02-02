package com.example.backend.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User saveUSers(User user){
        return userRepository.save(user);
    }
    public List<User> listOfUSers(){
        return userRepository.findAll();
    }
    public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }
    public void deleteUsers(Long id){
        userRepository.deleteById(id);
    }
}
