package adventure.adventure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
public class Employment {

    @Getter@Setter@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter@Setter
    private String company;
    @Getter@Setter
    private String position;
    @Getter@Setter
    private LocalDate startDate;
    @Getter@Setter
    private LocalDate endDate;


    public Employment() {
    }

    public Employment(String company, String position, LocalDate startDate, LocalDate endDate) {
        this.company = company;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }



    @Override
    public String toString() {
        return "Zatrudnienie{" +
                "id=" + id +
                ", firma='" + company + '\'' +
                ", stanowisko='" + position + '\'' +
                ", dataRozpoczęcia='" + startDate + '\'' +
                ", dataZakończenia='" + endDate + '\'' +
                '}';
    }
}