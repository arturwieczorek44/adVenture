package adventure.adventure.dto;

import adventure.adventure.entities.Application;

import java.time.LocalDate;

public class ApplicationWriteModel {

    private LocalDate applicationDate;
    private String status;

    // Konstruktor bezargumentowy
    public ApplicationWriteModel() {
    }

    // Konstruktor z argumentami
    public ApplicationWriteModel(LocalDate applicationDate, String status) {
        this.applicationDate = applicationDate;
        this.status = status;
    }

    // Gettery i settery

    public LocalDate getApplicationDate() {
        return this.applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Metoda służąca do konwersji z write model na encję
    public Application toEntity() {
        Application application = new Application();
        application.setApplicationDate(this.applicationDate);
        application.setStatus(this.status);
        return application;
    }
}
