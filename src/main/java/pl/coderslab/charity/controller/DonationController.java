package pl.coderslab.charity.controller;
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
import pl.coderslab.charity.service.CategoryServiceImpl;
import pl.coderslab.charity.service.DonationServiceImpl;
import pl.coderslab.charity.service.InstitutionServiceImpl;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping
public class DonationController {

    private final DonationServiceImpl donationService;
    private final CategoryServiceImpl categoryService;
    private final InstitutionServiceImpl institutionService;

    @GetMapping("/donation")
    public String addDonation(Model model) {
        model.addAttribute("donation", new Donation());
        return "donation-form";
    }

    @PostMapping("donation")
    public String addingDonation(@Valid @ModelAttribute("donation") Donation donation,
                                 BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("errors", true);
            return "donation-form";
        }
        donationService.addDonation(donation);
        return "";

    }

    @ModelAttribute("institutions")
    public List<Institution> getAllInstitutions(){
        return institutionService.findAll();
    }

    @ModelAttribute("categories")
    public List<Category> returnAllCategories(){
        return categoryService.findAll();
    }

}
