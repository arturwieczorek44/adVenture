package adventure.adventure.services;

import adventure.adventure.dto.JobOfferReadModel;
import adventure.adventure.dto.JobOfferWriteModel;
import adventure.adventure.entities.JobOffer;
import adventure.adventure.repositories.JobOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JobOfferService {

    private final JobOfferRepository jobOfferRepository;

    @Autowired
    public JobOfferService(JobOfferRepository jobOfferRepository) {
        this.jobOfferRepository = jobOfferRepository;
    }

    // Tworzenie nowego obiektu JobOffer
    public JobOffer createJobOffer(JobOfferWriteModel writeModel) {
        JobOffer jobOffer = writeModel.toEntity();
        return jobOfferRepository.save(jobOffer);
    }

    // Odczytanie wszystkich obiektów JobOffer
    public List<JobOfferReadModel> getAllJobOffers() {
        List<JobOffer> jobOffers = (List<JobOffer>) jobOfferRepository.findAll();
        return jobOffers.stream()
                .map(JobOfferReadModel::fromEntity)
                .collect(Collectors.toList());
    }

    // Odczytanie obiektu JobOffer o danym id
    public Optional<JobOfferReadModel> getJobOfferById(Long id) {
        Optional<JobOffer> jobOffer = jobOfferRepository.findById(id);
        return jobOffer.map(JobOfferReadModel::fromEntity);
    }

    // Aktualizacja obiektu JobOffer
    public JobOffer updateJobOffer(Long id, JobOfferWriteModel writeModel) {
        JobOffer jobOffer = writeModel.toEntity();
        jobOffer.setId(id);
        return jobOfferRepository.save(jobOffer);
    }

    // Usunięcie obiektu JobOffer
    public void deleteJobOffer(Long id) {
        jobOfferRepository.deleteById(id);
    }
}

