package pl.coderslab.charity.model;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalTime;
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
    private long id;

    @NotNull
    private int quantity; //W trello Integer?

    @ManyToMany
    private List<Category> categories;

    @ManyToOne
    private Institution institution;

    @NotNull
    private String street;

    @NotNull
    private String city;

    @NotNull
    @Pattern(regexp="[0-9]{2}-[0-9]{3}",message = "Invalid format")
    private String zipCode;

    @NotNull
//    @CreationTimestamp
//    @UpdateTimestamp
    private LocalDate pickUpDate;

    @NotNull
//    @CreationTimestamp
//    @UpdateTimestamp
    private LocalTime pickUpTime;

    @NotNull
    private String pickUpComment;
}
