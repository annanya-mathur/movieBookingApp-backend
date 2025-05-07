package service.impl;

import dto.userRegistrationRequest;
import exceptions.InvalidCredentialException;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.userService;

import java.util.Optional;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private final BCryptPasswordEncoder passwordEncoder =new BCryptPasswordEncoder();


    @Override
    public User registerUser(userRegistrationRequest registrationRequest) {

        if(!registrationRequest.getPassword().equals(registrationRequest.getConfirmPassword())) throw new InvalidCredentialException("Password do not match");

        if(userRepository.existsByLoginId(registrationRequest.getLoginId())) throw new InvalidCredentialException("Login Id already exist");

        if(userRepository.existByEmail(registrationRequest.getEmail())) throw new InvalidCredentialException("Email Id already exist");

        User user=new User(registrationRequest,"user", passwordEncoder.encode(registrationRequest.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByLoginId(String loginId) {
        return Optional.empty();
    }

    @Override
    public void resetPassword(String email, String password) {

    }
}
