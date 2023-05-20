package adventure.adventure.dto;

import adventure.adventure.entities.Role;

public class RoleReadModel {

    private Long id;
    private String name;

    // Konstruktor z argumentami
    public RoleReadModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    // Metoda służąca do konwersji z encji na read model
    public static RoleReadModel fromEntity(Role role) {
        return new RoleReadModel(
                role.getId(),
                role.getName()
        );
    }
}
