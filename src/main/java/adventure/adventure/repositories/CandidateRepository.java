package adventure.adventure.repositories;

import adventure.adventure.entities.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate,Long> {
    Optional<Candidate> findByEmail(String email);
}
