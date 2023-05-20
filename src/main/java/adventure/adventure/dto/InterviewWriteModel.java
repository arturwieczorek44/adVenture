package adventure.adventure.dto;

import adventure.adventure.entities.Interview;

import java.time.LocalDate;

public class InterviewWriteModel {

    private LocalDate submissionDate;
    private String notes;
    private boolean result;

    // Konstruktor bezargumentowy
    public InterviewWriteModel() {}

    // Konstruktor z argumentami
    public InterviewWriteModel(LocalDate submissionDate, String notes, boolean result) {
        this.submissionDate = submissionDate;
        this.notes = notes;
        this.result = result;
    }

    // Gettery i settery

    public LocalDate getSubmissionDate() {
        return this.submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean getResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    // Metoda służąca do konwersji z write model na encję
    public Interview toEntity() {
        return new Interview(this.submissionDate, this.notes, this.result);
    }
}
