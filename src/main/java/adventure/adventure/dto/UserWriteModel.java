package adventure.adventure.dto;

import adventure.adventure.entities.User;

public class UserWriteModel {

    private String username;
    private String password;

    // Konstruktor z argumentami
    public UserWriteModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter i Setter
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Metoda służąca do konwersji z write model na encję
    public User toEntity() {
        return new User(getUsername(), getPassword());
    }
}
