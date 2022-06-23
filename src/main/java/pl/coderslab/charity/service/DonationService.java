package pl.coderslab.charity.service;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface DonationService {


    Integer getSumOfBags();

    Integer getNumberOfDonations();
}
