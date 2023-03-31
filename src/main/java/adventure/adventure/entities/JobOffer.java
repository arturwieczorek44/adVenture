package adventure.adventure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
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
    private LocalDate data_skladania;


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
    public JobOffer(String nazwa_stanowiska, String opis, String wymagania, String lokalizacja, double pensja, LocalDate data_skladania) {
        this.nazwa_stanowiska = nazwa_stanowiska;
        this.opis = opis;
        this.wymagania = wymagania;
        this.lokalizacja = lokalizacja;
        this.pensja = pensja;
        this.data_skladania = data_skladania;
    }
}
