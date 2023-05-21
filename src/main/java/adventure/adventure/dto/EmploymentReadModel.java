package adventure.adventure.dto;

import adventure.adventure.entities.Employment;

import java.time.LocalDate;

public class EmploymentReadModel {

    private Long id;
    private String company;
    private String position;
    private LocalDate startDate;
    private LocalDate endDate;

    // Konstruktor z wszystkimi argumentami
    public EmploymentReadModel(Long id, String company, String position, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Gettery

    public Long getId() {
        return this.id;
    }

    public String getCompany() {
        return this.company;
    }

    public String getPosition() {
        return this.position;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    // Metoda służąca do konwersji z encji na read model
    public static EmploymentReadModel fromEntity(Employment employment) {
        return new EmploymentReadModel(
                employment.getId(),
                employment.getCompany(),
                employment.getPosition(),
                employment.getStartDate(),
                employment.getEndDate()
        );
    }
}

