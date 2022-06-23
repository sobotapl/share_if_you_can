package pl.coderslab.charity.controller;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.service.CategoryServiceImpl;
import pl.coderslab.charity.service.DonationServiceImpl;
import pl.coderslab.charity.service.InstitutionServiceImpl;

@AllArgsConstructor
@Controller
@RequestMapping("/donation")
public class DonationController {

    private final DonationServiceImpl donationService;
    private final CategoryServiceImpl categoryService;
    private final InstitutionServiceImpl institutionService;

    @GetMapping
    public String addDonation() {
        return "donation-form";
    }

}
