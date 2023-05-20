package adventure.adventure.services;

import adventure.adventure.dto.EmploymentReadModel;
import adventure.adventure.dto.EmploymentWriteModel;
import adventure.adventure.entities.Employment;
import adventure.adventure.repositories.EmploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmploymentService {

    private final EmploymentRepository employmentRepository;

    @Autowired
    public EmploymentService(EmploymentRepository employmentRepository) {
        this.employmentRepository = employmentRepository;
    }

    // Tworzenie nowego obiektu Employment
    public Employment createEmployment(EmploymentWriteModel writeModel) {
        Employment employment = writeModel.toEntity();
        return employmentRepository.save(employment);
    }

    // Odczytanie wszystkich obiektów Employment
    public List<EmploymentReadModel> getAllEmployments() {
        List<Employment> employments = (List<Employment>) employmentRepository.findAll();
        return employments.stream()
                .map(EmploymentReadModel::fromEntity)
                .collect(Collectors.toList());
    }

    // Odczytanie obiektu Employment o danym id
    public Optional<EmploymentReadModel> getEmploymentById(Long id) {
        Optional<Employment> employment = employmentRepository.findById(id);
        return employment.map(EmploymentReadModel::fromEntity);
    }

    // Aktualizacja obiektu Employment
    public Employment updateEmployment(Long id, EmploymentWriteModel writeModel) {
        Employment employment = writeModel.toEntity();
        employment.setId(id);
        return employmentRepository.save(employment);
    }

    // Usunięcie obiektu Employment
    public void deleteEmployment(Long id) {
        employmentRepository.deleteById(id);
    }
}

