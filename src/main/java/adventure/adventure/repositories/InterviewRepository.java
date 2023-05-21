package adventure.adventure.repositories;

import adventure.adventure.entities.Interview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepository extends CrudRepository<Interview,Long> {
}
