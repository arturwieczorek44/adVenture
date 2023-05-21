package adventure.adventure.dto;

import adventure.adventure.entities.Candidate;
import adventure.adventure.utilities.DegreesOfEducation;

public class CandidateReadModel {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private DegreesOfEducation degreeOfEducation;
    private String preferences;

    // Konstruktor z wszystkimi argumentami
    public CandidateReadModel(String firstName, String lastName, String phoneNumber, String email, DegreesOfEducation degreeOfEducation, String preferences) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.degreeOfEducation = degreeOfEducation;
        this.preferences = preferences;
    }

    // Gettery

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public DegreesOfEducation getDegreeOfEducation() {
        return this.degreeOfEducation;
    }

    public String getPreferences() {
        return this.preferences;
    }

    // Metoda służąca do konwersji z encji na read model
    public static CandidateReadModel fromEntity(Candidate candidate) {
        return new CandidateReadModel(
                candidate.getFirstName(),
                candidate.getLastName(),
                candidate.getPhoneNumber(),
                candidate.getEmail(),
                candidate.getDegreeOfEducation(),
                candidate.getPreferences()
        );
    }
}

