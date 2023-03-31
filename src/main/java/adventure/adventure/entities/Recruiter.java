package adventure.adventure.entities;

import adventure.adventure.utilities.DegreesOfEducation;
import adventure.adventure.utilities.DegreesOfRecruiters;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table(name="Recruiters")
public class Recruiter extends Person{
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private DegreesOfRecruiters degreeOfRecruiter;

    @Override
    public String toString() {
        return "Recruiter{" +
                "degreeOfRecruiter=" + degreeOfRecruiter +
                "} " + super.toString();
    }

    public Recruiter(String firstName, String lastName, String phoneNumber, String email, DegreesOfRecruiters degreeOfRecruiter) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setPhoneNumber(phoneNumber);
        super.setEmail(email);
        this.degreeOfRecruiter = degreeOfRecruiter;
    }



}
