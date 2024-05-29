package dto;

import lombok.Data;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class UserDto {
    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    private String bio;

    @NotBlank
    private String nickname;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @Past
    private LocalDate birthDate;
}