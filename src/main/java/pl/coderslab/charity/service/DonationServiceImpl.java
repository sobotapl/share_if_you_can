package pl.coderslab.charity.service;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class DonationServiceImpl implements DonationService{

    DonationServiceImpl donationService;

    @Override
    public Integer getSumOfBags() {
        return donationService.getSumOfBags();
    }

    @Override
    public Integer getNumberOfDonations() {
        return donationService.getNumberOfDonations();
    }
}
