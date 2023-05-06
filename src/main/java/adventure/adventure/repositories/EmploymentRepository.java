package adventure.adventure.repositories;

import adventure.adventure.entities.Employment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentRepository extends CrudRepository<Employment, Long> {

}