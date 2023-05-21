package adventure.adventure.dto;

import adventure.adventure.entities.JobOffer;

import java.time.LocalDate;

public class JobOfferWriteModel {

    private String nazwaStanowiska;
    private String opis;
    private String wymagania;
    private String lokalizacja;
    private double pensja;
    private LocalDate dataSkladania;

    // Konstruktor bezargumentowy
    public JobOfferWriteModel() {}

    // Konstruktor z argumentami
    public JobOfferWriteModel(String nazwaStanowiska, String opis, String wymagania, String lokalizacja, double pensja, LocalDate dataSkladania) {
        this.nazwaStanowiska = nazwaStanowiska;
        this.opis = opis;
        this.wymagania = wymagania;
        this.lokalizacja = lokalizacja;
        this.pensja = pensja;
        this.dataSkladania = dataSkladania;
    }

    // Gettery i settery

    public String getNazwaStanowiska() {
        return this.nazwaStanowiska;
    }

    public void setNazwaStanowiska(String nazwaStanowiska) {
        this.nazwaStanowiska = nazwaStanowiska;
    }

    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getWymagania() {
        return this.wymagania;
    }

    public void setWymagania(String wymagania) {
        this.wymagania = wymagania;
    }

    public String getLokalizacja() {
        return this.lokalizacja;
    }

    public void setLokalizacja(String lokalizacja) {
        this.lokalizacja = lokalizacja;
    }

    public double getPensja() {
        return this.pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public LocalDate getDataSkladania() {
        return this.dataSkladania;
    }

    public void setDataSkladania(LocalDate dataSkladania) {
        this.dataSkladania = dataSkladania;
    }

    // Metoda służąca do konwersji z write model na encję
    public JobOffer toEntity() {
        return new JobOffer(this.nazwaStanowiska, this.opis, this.wymagania, this.lokalizacja, this.pensja, this.dataSkladania);
    }
}
