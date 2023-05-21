package adventure.adventure.dto;

import adventure.adventure.entities.Application;

import java.time.LocalDate;

public class ApplicationReadModel {
    private Long id;
    private LocalDate applicationDate;
    private String status;

    // Konstruktor z wszystkimi argumentami
    public ApplicationReadModel(Long id, LocalDate applicationDate, String status) {
        this.id = id;
        this.applicationDate = applicationDate;
        this.status = status;
    }

    // Gettery

    public Long getId() {
        return this.id;
    }

    public LocalDate getApplicationDate() {
        return this.applicationDate;
    }

    public String getStatus() {
        return this.status;
    }

    // Metoda służąca do konwersji z encji na read model
    public static ApplicationReadModel fromEntity(Application application) {
        return new ApplicationReadModel(
                application.getId(),
                application.getApplicationDate(),
                application.getStatus()
        );
    }
}
