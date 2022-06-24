package pl.coderslab.charity.service;
import lombok.Data;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.repository.DonationRepository;

@Data
@Service
public class DonationServiceImpl implements DonationService{

    private final DonationRepository donationRepository;

    @Override
    public Integer getSumOfBags() {
        return donationRepository.getSumOfBags();
    }

    @Override
    public Integer getNumberOfDonations() {
        return donationRepository.getNumberOfDonations();
    }

    @Override
    public void addDonation(Donation donation) {
        donationRepository.save(donation);
    }


}
