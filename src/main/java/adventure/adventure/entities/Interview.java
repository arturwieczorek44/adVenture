package adventure.adventure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity

@NoArgsConstructor
@Table(name="Interviews")
public class Interview {


    @Id
    @Setter
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private Long candidateId;
//    private Long jobOfferId;
    @Getter
    @Setter
    private LocalDate submissionDate;
    @Getter
    @Setter
    private String notes;
    @Getter
    @Setter
    boolean result;
    public Interview(LocalDate submissionDate, String notes, boolean result) {
        this.submissionDate = submissionDate;
        this.notes = notes;
        this.result = result;
    }

}