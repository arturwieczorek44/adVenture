package adventure.adventure.repositories;

import adventure.adventure.entities.Candidate;
import adventure.adventure.entities.Recruiter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RecruiterRepository extends CrudRepository<Recruiter,Long> {
    Optional<Recruiter> findByEmail(String email);
}
