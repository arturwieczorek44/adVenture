package adventure.adventure.repositories;

import adventure.adventure.entities.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends CrudRepository<Skill,Long> {
}
