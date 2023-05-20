package adventure.adventure.dto;

import adventure.adventure.entities.Role;
import adventure.adventure.entities.User;

import java.util.Set;
import java.util.stream.Collectors;

public class UserReadModel {

    private Long id;
    private String username;
    private Set<String> roles;

    // Konstruktor z argumentami
    public UserReadModel(Long id, String username, Set<String> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
    }

    // Getters
    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public Set<String> getRoles() {
        return this.roles;
    }

    // Metoda służąca do konwersji z encji na read model
    public static UserReadModel fromEntity(User user) {
        Set<String> roleNames = user.getRoles().stream()
                .map(Role::getName)
                .collect(Collectors.toSet());

        return new UserReadModel(
                user.getId(),
                user.getUsername(),
                roleNames
        );
    }
}
