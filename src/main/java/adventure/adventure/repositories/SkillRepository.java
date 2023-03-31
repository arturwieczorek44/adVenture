package adventure.adventure.repositories;

import adventure.adventure.entities.Skill;
import org.springframework.data.repository.CrudRepository;

public interface SkillRepository extends CrudRepository<Skill,Long> {
}
