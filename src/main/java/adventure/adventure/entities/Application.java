package adventure.adventure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity @AllArgsConstructor @NoArgsConstructor @Table(name = "APPLICATIONS")
public class Application {

    @Id @Setter @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter @Getter
    @Column(name = "application_date")
    private LocalDate applicationDate;

    @Setter @Getter
    @Column(name = "status", length = 20)
    private String status;

//    private Long candidateId;
//    private Long jobOfferId;



}
