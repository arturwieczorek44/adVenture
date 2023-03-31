package adventure.adventure.entities;

import jakarta.persistence.*;

@Entity
public class Employment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company;
    private String position;
    private String startDate;
    private String endDate;

    public Employment() {
    }

    public Employment(String company, String position, String startDate, String endDate) {
        this.company = company;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Zatrudnienie{" +
                "id=" + id +
                ", firma='" + company + '\'' +
                ", stanowisko='" + position + '\'' +
                ", dataRozpoczęcia='" + startDate + '\'' +
                ", dataZakończenia='" + endDate + '\'' +
                '}';
    }
}