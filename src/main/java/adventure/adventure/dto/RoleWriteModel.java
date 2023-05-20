package adventure.adventure.dto;

import adventure.adventure.entities.Role;

public class RoleWriteModel {

    private String name;

    // Konstruktor z argumentami
    public RoleWriteModel(String name) {
        this.name = name;
    }

    // Getter i Setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Metoda służąca do konwersji z write model na encję
    public Role toEntity() {
        return new Role(getName());
    }
}
