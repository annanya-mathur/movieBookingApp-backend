package repository;

import models.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends MongoRepository<user,String> {

    Optional<user> findByLoginId(String loginId);
}
