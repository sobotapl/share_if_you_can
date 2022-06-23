package pl.coderslab.charity.controller;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Controller
public class HomeController {

    InstitutionRepository institutionRepository;


    @GetMapping("/")
    public String homeAction(){
        return "index";
    }



//    @ModelAttribute("institutions")
//    public List<Institution> returnAllInstitutions(){
//        return institutionRepository.findAll();
//    }



}
