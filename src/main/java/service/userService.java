package service;

import models.user;

import java.util.Optional;

public interface userService {

    public user registerUser(user user);
    public Optional<user> findByLoginId(String loginId);
    public void resetPassword(String email , String password);
}
