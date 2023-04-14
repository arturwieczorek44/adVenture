package adventure.adventure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity

public class Role {

    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_USER = "USER";
    public static final String ROLE_HR_MANAGER = "HR_MANAGER";
    public static final String ROLE_HR_EMPLOYEE = "HR_EMPLOYEE";
    public static final String ROLE_RECRUITER = "RECRUITER";
    public static final String ROLE_CANDIDATE = "CANDIDATE";

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Getter
    @Setter
    @Column(unique = true)
    private String name;

    public Role() {}


    public Role(String name) {
        this.name = name;
    }
}
