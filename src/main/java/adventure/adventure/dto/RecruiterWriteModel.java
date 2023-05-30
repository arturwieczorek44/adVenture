package adventure.adventure.dto;

import adventure.adventure.entities.Person;
import adventure.adventure.entities.Recruiter;
import adventure.adventure.utilities.DegreesOfRecruiters;

public class RecruiterWriteModel extends PersonWriteModel {

    private DegreesOfRecruiters degreeOfRecruiter;

    // Konstruktor z argumentami
    public RecruiterWriteModel(String firstName, String lastName, String email, String phoneNumber, DegreesOfRecruiters degreeOfRecruiter) {
        super(firstName, lastName, email, phoneNumber);
        this.degreeOfRecruiter = degreeOfRecruiter;
    }

    // Getter i Setter
    public DegreesOfRecruiters getDegreeOfRecruiter() {
        return this.degreeOfRecruiter;
    }

    public void setDegreeOfRecruiter(DegreesOfRecruiters degreeOfRecruiter) {
        this.degreeOfRecruiter = degreeOfRecruiter;
    }

    // Metoda służąca do konwersji z write model na encję
    public Person toEntity() {
        Recruiter recruiter = new Recruiter(getFirstName(), getLastName(), getPhoneNumber(), getEmail(), getDegreeOfRecruiter());
        return new Person();
    }
}
