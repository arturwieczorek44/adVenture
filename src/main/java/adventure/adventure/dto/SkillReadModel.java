package adventure.adventure.dto;

import adventure.adventure.entities.Skill;

public class SkillReadModel {

    private Long id;
    private String skillName;

    // Konstruktor z argumentami
    public SkillReadModel(Long id, String skillName) {
        this.id = id;
        this.skillName = skillName;
    }

    // Getters
    public Long getId() {
        return this.id;
    }

    public String getSkillName() {
        return this.skillName;
    }

    // Metoda służąca do konwersji z encji na read model
    public static SkillReadModel fromEntity(Skill skill) {
        return new SkillReadModel(
                skill.getId(),
                skill.getSkillName()
        );
    }
}
