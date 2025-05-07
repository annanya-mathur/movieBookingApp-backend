package repository;

import models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

    Optional<User> findByLoginId(String loginId);
    boolean existsByLoginId(String loginId);
    boolean existByEmail(String email);
}
