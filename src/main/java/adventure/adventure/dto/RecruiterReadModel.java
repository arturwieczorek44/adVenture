package adventure.adventure.dto;

import adventure.adventure.entities.Recruiter;
import adventure.adventure.utilities.DegreesOfRecruiters;

public class RecruiterReadModel extends PersonReadModel {

    private DegreesOfRecruiters degreeOfRecruiter;

    // Konstruktor z argumentami
    public RecruiterReadModel(Long id, String firstName, String lastName, String email, String phoneNumber, DegreesOfRecruiters degreeOfRecruiter) {
        super(id, firstName, lastName, email, phoneNumber);
        this.degreeOfRecruiter = degreeOfRecruiter;
    }

    // Getter
    public DegreesOfRecruiters getDegreeOfRecruiter() {
        return this.degreeOfRecruiter;
    }

    // Metoda służąca do konwersji z encji na read model
    public static RecruiterReadModel fromEntity(Recruiter recruiter) {
        return new RecruiterReadModel(
                recruiter.getId(),
                recruiter.getFirstName(),
                recruiter.getLastName(),
                recruiter.getEmail(),
                recruiter.getPhoneNumber(),
                recruiter.getDegreeOfRecruiter()
        );
    }
}

