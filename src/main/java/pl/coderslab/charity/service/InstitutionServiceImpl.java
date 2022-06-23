package pl.coderslab.charity.service;
import lombok.Data;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;
import java.util.List;

@Data
@Service
public class InstitutionServiceImpl implements InstitutionService{

    InstitutionRepository institutionRepository;

    @Override
    public List<Institution> findAll() {
        return null;
    }
}
