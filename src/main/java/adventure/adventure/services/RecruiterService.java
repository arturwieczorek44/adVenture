package adventure.adventure.services;

import adventure.adventure.dto.RecruiterReadModel;
import adventure.adventure.dto.RecruiterWriteModel;
import adventure.adventure.entities.Recruiter;
import adventure.adventure.repositories.RecruiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RecruiterService {

    private final RecruiterRepository recruiterRepository;

    @Autowired
    public RecruiterService(RecruiterRepository recruiterRepository) {
        this.recruiterRepository = recruiterRepository;
    }

    // Tworzenie nowego obiektu Recruiter
    public Recruiter createRecruiter(RecruiterWriteModel writeModel) {
        Recruiter recruiter = writeModel.toEntity();
        return recruiterRepository.save(recruiter);
    }

    // Odczytanie wszystkich obiektów Recruiter
    public List<RecruiterReadModel> getAllRecruiters() {
        List<Recruiter> recruiters = (List<Recruiter>) recruiterRepository.findAll();
        return recruiters.stream()
                .map(RecruiterReadModel::fromEntity)
                .collect(Collectors.toList());
    }

    // Odczytanie obiektu Recruiter o danym id
    public Optional<RecruiterReadModel> getRecruiterById(Long id) {
        Optional<Recruiter> recruiter = recruiterRepository.findById(id);
        return recruiter.map(RecruiterReadModel::fromEntity);
    }

    // Aktualizacja obiektu Recruiter
    public Recruiter updateRecruiter(Long id, RecruiterWriteModel writeModel) {
        Recruiter recruiter = writeModel.toEntity();
        recruiter.setId(id);
        return recruiterRepository.save(recruiter);
    }

    // Usunięcie obiektu Recruiter
    public void deleteRecruiter(Long id) {
        recruiterRepository.deleteById(id);
    }
}