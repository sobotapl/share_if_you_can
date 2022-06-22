package pl.coderslab.charity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {

    //ok?
    @Query("SELECT SUM(d.quantity) FROM Donation d")
    Integer getSumOfBags();

    //ok?
    @Query("SELECT COUNT(d) from Donation d")
    Integer getNumberOfDonations();

}
