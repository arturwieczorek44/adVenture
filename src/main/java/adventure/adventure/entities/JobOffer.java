package adventure.adventure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="JobOffer")
public class JobOffer {
    @Id
    @Setter
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter
    private String nazwa_stanowiska;
    @Getter @Setter
    private String opis;
    @Getter @Setter
    private String wymagania;
    @Getter @Setter
    private String lokalizacja;
    @Getter @Setter
    private double pensja;
    @Getter @Setter
    //prawdopodbnie jest to do zmiany
    private Date data_skladania;


    @Override
    public String toString() {
        return "JobOffer{" +
                "id=" + id +
                ", nazwa_stanowiska='" + nazwa_stanowiska + '\'' +
                ", opis='" + opis + '\'' +
                ", wymagania='" + wymagania + '\'' +
                ", lokalizacja='" + lokalizacja + '\'' +
                ", pensja=" + pensja +
                ", data_skladania=" + data_skladania +
                '}';
    }
}
