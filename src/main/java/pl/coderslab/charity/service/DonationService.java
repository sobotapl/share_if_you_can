package pl.coderslab.charity.service;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;

@Service
public interface DonationService {


    Integer getSumOfBags();

    Integer getNumberOfDonations();

    void addDonation(Donation donation);
}
