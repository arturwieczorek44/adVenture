package adventure.adventure.dto;

import adventure.adventure.entities.Skill;

public class SkillWriteModel {

    private String skillName;

    // Konstruktor z argumentami
    public SkillWriteModel(String skillName) {
        this.skillName = skillName;
    }

    // Getter i Setter
    public String getSkillName() {
        return this.skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    // Metoda służąca do konwersji z write model na encję
    public Skill toEntity() {
        return new Skill(getSkillName());
    }
}
