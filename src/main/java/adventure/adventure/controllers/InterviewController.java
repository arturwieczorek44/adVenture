package adventure.adventure.controllers;

import adventure.adventure.entities.Interview;
import adventure.adventure.repositories.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("api/interviews")
public class InterviewController {
    @Autowired
    private InterviewRepository interviewRepository;

    @GetMapping("/{id}")
    public Interview getInterviewById(@PathVariable Long id) {
        Optional<Interview> interview = interviewRepository.findById(id);
        if (interview.isPresent()) {
            return interview.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Interview not found");
        }
    }

    @PostMapping
    public Interview createInterview(@RequestBody Interview interview) {
        return interviewRepository.save(interview);
    }

    @PutMapping("/{id}")
    public Interview updateInterview(@PathVariable Long id, @RequestBody Interview interview) {
        Optional<Interview> existingInterview = interviewRepository.findById(id);
        if (existingInterview.isPresent()) {
            interview.setId(id);
            return interviewRepository.save(interview);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Interview not found");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteInterview(@PathVariable Long id) {
        Optional<Interview> interview = interviewRepository.findById(id);
        if (interview.isPresent()) {
            interviewRepository.delete(interview.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Interview not found");
        }
    }

    @GetMapping
    public Iterable<Interview> getAllInterviews() {
        return interviewRepository.findAll();
    }
}

