package adventure.adventure.services;

import adventure.adventure.dto.CandidateReadModel;
import adventure.adventure.dto.CandidateWriteModel;
import adventure.adventure.entities.Candidate;
import adventure.adventure.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    // Tworzenie nowego obiektu Candidate
    public Candidate createCandidate(CandidateWriteModel writeModel) {
        Candidate candidate = writeModel.toEntity();
        return candidateRepository.save(candidate);
    }

    // Odczytanie wszystkich obiektów Candidate
    public List<CandidateReadModel> getAllCandidates() {
        List<Candidate> candidates = (List<Candidate>) candidateRepository.findAll();
        return candidates.stream()
                .map(CandidateReadModel::fromEntity)
                .collect(Collectors.toList());
    }

    // Odczytanie obiektu Candidate o danym id
    public Optional<CandidateReadModel> getCandidateById(Long id) {
        Optional<Candidate> candidate = candidateRepository.findById(id);
        return candidate.map(CandidateReadModel::fromEntity);
    }

    // Aktualizacja obiektu Candidate
    public Candidate updateCandidate(Long id, CandidateWriteModel writeModel) {
        Candidate candidate = writeModel.toEntity();
        candidate.setId(id);
        return candidateRepository.save(candidate);
    }

    // Usunięcie obiektu Candidate
    public void deleteCandidate(Long id) {
        candidateRepository.deleteById(id);
    }
}

