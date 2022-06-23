package pl.coderslab.charity.model;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@Table(name = "donations")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private int quantity;

    @NotEmpty
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Category> categories = new ArrayList<>();

    @ManyToOne
    private Institution institution;

    @NotBlank
    private String street;

    @NotBlank
    private String city;

    @NotNull
    @Pattern(regexp="[0-9]{2}-[0-9]{3}",message = "Invalid format")
    private String zipCode;

    @NotNull
    private LocalDate pickUpDate;

    @NotNull
    private LocalTime pickUpTime;

    @NotBlank
    private String pickUpComment;
}
