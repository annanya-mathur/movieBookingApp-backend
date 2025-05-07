package service;

import dto.userRegistrationRequest;
import models.User;

import java.util.Optional;

public interface userService {

    public User registerUser(userRegistrationRequest registrationRequest);
    public Optional<User> findByLoginId(String loginId);
    public void resetPassword(String email , String password);
}
