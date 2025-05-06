package repository;

import models.ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ticketRepository extends MongoRepository<ticket,String> {
}
