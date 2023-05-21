package adventure.adventure.dto;

import adventure.adventure.entities.Person;

public class PersonWriteModel {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    // Konstruktor z argumentami
    public PersonWriteModel(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Gettery i settery

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Metoda służąca do konwersji z write model na encję
    public Person toEntity() {
        return new Person(null, this.firstName, this.lastName, this.email, this.phoneNumber);
    }
}
