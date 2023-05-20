package adventure.adventure.services;

import adventure.adventure.dto.ApplicationReadModel;
import adventure.adventure.dto.ApplicationWriteModel;
import adventure.adventure.entities.Application;
import adventure.adventure.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    // Tworzenie nowego obiektu Application
    public Application createApplication(ApplicationWriteModel writeModel) {
        Application application = writeModel.toEntity();
        return applicationRepository.save(application);
    }

    // Odczytanie wszystkich obiektów Application
    public List<ApplicationReadModel> getAllApplications() {
        List<Application> applications = (List<Application>) applicationRepository.findAll();
        return applications.stream()
                .map(ApplicationReadModel::fromEntity)
                .collect(Collectors.toList());
    }

    // Odczytanie obiektu Application o danym id
    public Optional<ApplicationReadModel> getApplicationById(Long id) {
        Optional<Application> application = applicationRepository.findById(id);
        return application.map(ApplicationReadModel::fromEntity);
    }

    // Aktualizacja obiektu Application
    public Application updateApplication(Long id, ApplicationWriteModel writeModel) {
        Application application = writeModel.toEntity();
        application.setId(id);
        return applicationRepository.save(application);
    }

    // Usunięcie obiektu Application
    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }
}