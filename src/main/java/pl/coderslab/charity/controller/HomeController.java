package pl.coderslab.charity.controller;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.service.DonationServiceImpl;
import pl.coderslab.charity.service.InstitutionServiceImpl;
import java.util.List;


@AllArgsConstructor
@Controller
public class HomeController {

    private final InstitutionServiceImpl institutionService;
    private final DonationServiceImpl donationService;


    @GetMapping("/")
    public String homeAction(Model model) {
        return "index";
    }


    @ModelAttribute("sumOfDonations")
    public Integer getSumOfBugs(){
        return donationService.getSumOfBags();
    }

    @ModelAttribute("amountOfBags")
    public Integer getAmountOfBags(){
        return donationService.getNumberOfDonations();
    }

    @ModelAttribute("amountOfBags")
    public List<Institution> returnAllInstitutions(){
        return institutionService.findAll();
    }



}
