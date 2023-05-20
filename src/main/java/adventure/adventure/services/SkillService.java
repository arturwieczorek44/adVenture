package adventure.adventure.services;

import adventure.adventure.dto.SkillReadModel;
import adventure.adventure.dto.SkillWriteModel;
import adventure.adventure.entities.Skill;
import adventure.adventure.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    @Autowired
    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    // Tworzenie nowego obiektu Skill
    public Skill createSkill(SkillWriteModel writeModel) {
        Skill skill = writeModel.toEntity();
        return skillRepository.save(skill);
    }

    // Odczytanie wszystkich obiektów Skill
    public List<SkillReadModel> getAllSkills() {
        List<Skill> skills = (List<Skill>) skillRepository.findAll();
        return skills.stream()
                .map(SkillReadModel::fromEntity)
                .collect(Collectors.toList());
    }

    // Odczytanie obiektu Skill o danym id
    public Optional<SkillReadModel> getSkillById(Long id) {
        Optional<Skill> skill = skillRepository.findById(id);
        return skill.map(SkillReadModel::fromEntity);
    }

    // Aktualizacja obiektu Skill
    public Skill updateSkill(Long id, SkillWriteModel writeModel) {
        Skill skill = writeModel.toEntity();
        skill.setId(id);
        return skillRepository.save(skill);
    }

    // Usunięcie obiektu Skill
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }
}

