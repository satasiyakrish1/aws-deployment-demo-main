//package com.example.demo.service;
//
//import com.example.demo.model.User;
//import com.example.demo.repository.UserRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService {
//
//    private final UserRepository repository;
//
//    public UserService(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    public User saveUser(User user) {
//        return repository.save(user);
//    }
//
//    public List<User> getAllUsers() {
//        return repository.findAll();
//    }
//
//    public void deleteUser(Long id) {
//        repository.deleteById(id);
//    }
//}
