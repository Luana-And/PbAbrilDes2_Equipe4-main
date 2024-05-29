package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "summary", length = 300)
    private String summary;

    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;
    public boolean isValidAge() {
        LocalDate now = LocalDate.now();
        LocalDate eighteenYearsAgo = now.minusYears(18);
        return birthdate.isBefore(eighteenYearsAgo);
    }

    @Column(name = "username", nullable = false, unique = true, length = 20)
    private String username;

    @Column(name = "email", nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
