package adventure.adventure.dto;

import adventure.adventure.entities.Employment;

import java.time.LocalDate;

public class EmploymentWriteModel {

    private String company;
    private String position;
    private LocalDate startDate;
    private LocalDate endDate;

    // Konstruktor bezargumentowy
    public EmploymentWriteModel() {}

    // Konstruktor z argumentami
    public EmploymentWriteModel(String company, String position, LocalDate startDate, LocalDate endDate) {
        this.company = company;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Gettery i settery

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // Metoda służąca do konwersji z write model na encję
    public Employment toEntity() {
        Employment employment = new Employment();
        employment.setCompany(this.company);
        employment.setPosition(this.position);
        employment.setStartDate(this.startDate);
        employment.setEndDate(this.endDate);
        return employment;
    }
}
