package net.skhu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.entity.User;
import net.skhu.model.UserRegistration;
import net.skhu.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User createEntity(UserRegistration userRegistration) {
        User user = new User();
        user.setEmail(userRegistration.getEmail());
        user.setPassword(userRegistration.getPasswd());
        user.setName(userRegistration.getName());
        user.setAddress(userRegistration.getAddress());
        user.setAddress_detail(userRegistration.getAddress_detail());
        return user;
    }

    public void save(UserRegistration userRegistration) {
        User user = createEntity(userRegistration);
        userRepository.save(user);
    }

}
