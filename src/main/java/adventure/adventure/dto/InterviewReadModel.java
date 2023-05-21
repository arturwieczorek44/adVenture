package adventure.adventure.dto;

import adventure.adventure.entities.Interview;

import java.time.LocalDate;

public class InterviewReadModel {

    private Long id;
    private LocalDate submissionDate;
    private String notes;
    private boolean result;

    // Konstruktor z wszystkimi argumentami
    public InterviewReadModel(Long id, LocalDate submissionDate, String notes, boolean result) {
        this.id = id;
        this.submissionDate = submissionDate;
        this.notes = notes;
        this.result = result;
    }

    // Gettery

    public Long getId() {
        return this.id;
    }

    public LocalDate getSubmissionDate() {
        return this.submissionDate;
    }

    public String getNotes() {
        return this.notes;
    }

    public boolean getResult() {
        return this.result;
    }

    // Metoda służąca do konwersji z encji na read model
    public static InterviewReadModel fromEntity(Interview interview) {
        return new InterviewReadModel(
                interview.getId(),
                interview.getSubmissionDate(),
                interview.getNotes(),
                interview.isResult()
        );
    }
}
