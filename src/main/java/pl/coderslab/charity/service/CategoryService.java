package pl.coderslab.charity.service;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Institution;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAll();

}
