package pl.coderslab.charity.controller.mvc;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.service.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping
public class DonationController {

    private final DonationService donationService;
    private final CategoryService categoryService;
    private final InstitutionService institutionService;

    // obiekt posredniczzacy?
    @PostMapping("donation")
    public String addingDonation(HttpSession httpSession) {
        Donation donation = (Donation) httpSession.getAttribute("donation");
        donationService.addDonation(donation);
        httpSession.removeAttribute("donation");
        return "donation"; //powinno byc confirmation

    }
    @PostMapping("/displaysummary")
    public String displaySummary(@Valid @ModelAttribute("donation") Donation donation,
                                 BindingResult result, Model model, HttpSession httpSession){
        model.addAttribute("donation", donation);
        httpSession.setAttribute("donation", donation);
        return "donationconfirmation";
    }

    @GetMapping("/donation")
    public String addDonation(Model model) {
        model.addAttribute("donation", new Donation());
        return "donation-add";
    }

    @ModelAttribute("donation")
    public Donation donation() {
        return new Donation();
    }

    @ModelAttribute("institutions")
    public List<Institution> getAllInstitutions(){
        return institutionService.findAll();
    }

    @ModelAttribute("categories")
    public List<Category> getAllCategories(){
        return categoryService.findAll();
    }

}
