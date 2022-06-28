package pl.coderslab.charity.controller.mvc;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.DonationServiceImpl;
import pl.coderslab.charity.service.InstitutionService;
import pl.coderslab.charity.service.InstitutionServiceImpl;
import java.util.List;


@AllArgsConstructor
@Controller
public class HomeController {


    private final InstitutionService institutionService;
    private final DonationService donationService;


    @GetMapping("/")
    public String homeAction(Model model) {
        return "landing-page";
    }


    @ModelAttribute("sumOfDonations")
    public Integer getSumOfBugs(){
        return donationService.getSumOfBags();
    }

    @ModelAttribute("amountOfBags")
    public Long getAmountOfBags(){
        return donationService.getNumberOfDonations();
    }

    @ModelAttribute("institutions")
    public List<Institution> getAllInstitutions(){
        return institutionService.findAll();
    }

    @GetMapping("/contact")
    public String getContact(){
        return "fragments/contact";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "fragments/about";
    }

    @GetMapping("/info")
    public String getInfo(){
        return "fragments/info";
    }

    @GetMapping("/institutions")
    public String getInstitutions(){
        return "fragments/institutions";
    }



}
