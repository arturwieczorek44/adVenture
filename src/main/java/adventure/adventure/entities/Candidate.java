package adventure.adventure.entities;

import adventure.adventure.utilities.DegreesOfEducation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @AllArgsConstructor @NoArgsConstructor @Table(name="CANDIDATES")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter
    private String firstNme;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String phoneNumber;
    @Getter @Setter @Enumerated(EnumType.STRING)
    private DegreesOfEducation degreeOfEducation;
    @Getter @Setter
    private String preferences;

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", firstNme='" + firstNme + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", degreeOfEducation=" + degreeOfEducation +
                ", preferences='" + preferences + '\'' +
                '}';
    }
}
