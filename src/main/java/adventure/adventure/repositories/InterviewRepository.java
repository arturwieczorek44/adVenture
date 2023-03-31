package adventure.adventure.repositories;

import adventure.adventure.entities.Interview;
import org.springframework.data.repository.CrudRepository;

public interface InterviewRepository extends CrudRepository<Interview,Long> {
}
