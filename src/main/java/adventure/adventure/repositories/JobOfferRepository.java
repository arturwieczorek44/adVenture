package adventure.adventure.repositories;

import adventure.adventure.entities.JobOffer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOfferRepository extends CrudRepository<JobOffer,Long> {
}
