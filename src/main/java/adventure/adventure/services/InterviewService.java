package adventure.adventure.services;

import adventure.adventure.dto.InterviewReadModel;
import adventure.adventure.dto.InterviewWriteModel;
import adventure.adventure.entities.Interview;
import adventure.adventure.repositories.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InterviewService {

    private final InterviewRepository interviewRepository;

    @Autowired
    public InterviewService(InterviewRepository interviewRepository) {
        this.interviewRepository = interviewRepository;
    }

    // Tworzenie nowego obiektu Interview
    public Interview createInterview(InterviewWriteModel writeModel) {
        Interview interview = writeModel.toEntity();
        return interviewRepository.save(interview);
    }

    // Odczytanie wszystkich obiektów Interview
    public List<InterviewReadModel> getAllInterviews() {
        List<Interview> interviews = (List<Interview>) interviewRepository.findAll();
        return interviews.stream()
                .map(InterviewReadModel::fromEntity)
                .collect(Collectors.toList());
    }

    // Odczytanie obiektu Interview o danym id
    public Optional<InterviewReadModel> getInterviewById(Long id) {
        Optional<Interview> interview = interviewRepository.findById(id);
        return interview.map(InterviewReadModel::fromEntity);
    }

    // Aktualizacja obiektu Interview
    public Interview updateInterview(Long id, InterviewWriteModel writeModel) {
        Interview interview = writeModel.toEntity();
        interview.setId(id);
        return interviewRepository.save(interview);
    }

    // Usunięcie obiektu Interview
    public void deleteInterview(Long id) {
        interviewRepository.deleteById(id);
    }
}
