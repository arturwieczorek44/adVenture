package adventure.adventure.dto;

import adventure.adventure.entities.JobOffer;

import java.time.LocalDate;

public class JobOfferReadModel {

    private Long id;
    private String nazwaStanowiska;
    private String opis;
    private String wymagania;
    private String lokalizacja;
    private double pensja;
    private LocalDate dataSkladania;

    // Konstruktor z wszystkimi argumentami
    public JobOfferReadModel(Long id, String nazwaStanowiska, String opis, String wymagania, String lokalizacja, double pensja, LocalDate dataSkladania) {
        this.id = id;
        this.nazwaStanowiska = nazwaStanowiska;
        this.opis = opis;
        this.wymagania = wymagania;
        this.lokalizacja = lokalizacja;
        this.pensja = pensja;
        this.dataSkladania = dataSkladania;
    }

    // Gettery

    public Long getId() {
        return this.id;
    }

    public String getNazwaStanowiska() {
        return this.nazwaStanowiska;
    }

    public String getOpis() {
        return this.opis;
    }

    public String getWymagania() {
        return this.wymagania;
    }

    public String getLokalizacja() {
        return this.lokalizacja;
    }

    public double getPensja() {
        return this.pensja;
    }

    public LocalDate getDataSkladania() {
        return this.dataSkladania;
    }

    // Metoda służąca do konwersji z encji na read model
    public static JobOfferReadModel fromEntity(JobOffer jobOffer) {
        return new JobOfferReadModel(
                jobOffer.getId(),
                jobOffer.getNazwa_stanowiska(),
                jobOffer.getOpis(),
                jobOffer.getWymagania(),
                jobOffer.getLokalizacja(),
                jobOffer.getPensja(),
                jobOffer.getData_skladania()
        );
    }
}
