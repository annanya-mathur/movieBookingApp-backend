package repository;

import models.movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movieRepository extends MongoRepository<movie, String> {
}
