package adventure.adventure.entities;

import adventure.adventure.utilities.DegreesOfEducation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @NoArgsConstructor @Table(name="CANDIDATES")
public class Candidate extends User {
    //        Candidate candidate1= new Candidate("Wojciech","Krzysztoszowski","wkk@pw.lp","997", DegreesOfEducation.DOCTORATE,"mobing");
    public Candidate(String firstName, String lastName, String phoneNumber, String email,DegreesOfEducation degreeOfEducation, String preferences) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setPhoneNumber(phoneNumber);
        super.setEmail(email);
        this.degreeOfEducation = degreeOfEducation;
        this.preferences = preferences;

    }

    @Getter @Setter @Enumerated(EnumType.STRING)
    private DegreesOfEducation degreeOfEducation;
    @Getter @Setter
    private String preferences;

    @Override
    public String toString() {
        return "Candidate{" +
                "degreeOfEducation=" + degreeOfEducation +
                ", preferences='" + preferences + '\'' +
                "} " + super.toString();
    }
}
