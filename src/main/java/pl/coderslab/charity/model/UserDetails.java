package pl.coderslab.charity.model;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString(exclude = "password")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetails {

    @NotBlank(message = "Podaj imię")
    private String firstName;

    @NotBlank (message = "Podaj nazwisko")
    private String lastName;

    @Email
    @NotBlank (message = "Podaj prawidłowy email")

    private String email;

    @Size(min = 8, max = 20, message = "Hasło musi mieć minimum 8 znaków")
    private String password;
    @NotBlank (message = "Podaj login")

    //walidacja czy login zajety
    private String username;

    private String role;

}
