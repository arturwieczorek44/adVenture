package adventure.adventure.dto;

import adventure.adventure.entities.Candidate;
import adventure.adventure.utilities.DegreesOfEducation;

public class CandidateWriteModel {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private DegreesOfEducation degreeOfEducation;
    private String preferences;

    // Konstruktor bezargumentowy
    public CandidateWriteModel() {}

    // Konstruktor z argumentami
    public CandidateWriteModel(String firstName, String lastName, String phoneNumber, String email, DegreesOfEducation degreeOfEducation, String preferences) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.degreeOfEducation = degreeOfEducation;
        this.preferences = preferences;
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

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DegreesOfEducation getDegreeOfEducation() {
        return this.degreeOfEducation;
    }

    public void setDegreeOfEducation(DegreesOfEducation degreeOfEducation) {
        this.degreeOfEducation = degreeOfEducation;
    }

    public String getPreferences() {
        return this.preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    // Metoda służąca do konwersji z write model na encję
    public Candidate toEntity() {
        Candidate candidate = new Candidate();
        candidate.setFirstName(this.firstName);
        candidate.setLastName(this.lastName);
        candidate.setPhoneNumber(this.phoneNumber);
        candidate.setEmail(this.email);
        candidate.setDegreeOfEducation(this.degreeOfEducation);
        candidate.setPreferences(this.preferences);
        return candidate;
    }
}
