package service.impl;

import models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import repository.userRepository;
import service.userService;

import java.util.Optional;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepository UserRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @Override
    public user registerUser(user user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return UserRepository.save(user);
    }

    @Override
    public Optional<user> findByLoginId(String loginId) {
        return Optional.empty();
    }

    @Override
    public void resetPassword(String email, String password) {

    }
}
