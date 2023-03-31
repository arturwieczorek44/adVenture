package adventure.adventure.controllers;

import adventure.adventure.entities.Recruiter;
import adventure.adventure.repositories.RecruiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;
@RestController
@RequestMapping("/api/recruiters")
public class RecruiterController {

    @Autowired
    private RecruiterRepository recruiterRepository;

    @GetMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable Long id) {
        Optional<Recruiter> recruiter = recruiterRepository.findById(id);
        if (recruiter.isPresent()) {
            return recruiter.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recruiter not found");
        }
    }

    @PostMapping
    public Recruiter createRecruiter(@RequestBody Recruiter recruiter) {
        return recruiterRepository.save(recruiter);
    }

    @PutMapping("/{id}")
    public Recruiter updateRecruiter(@PathVariable Long id, @RequestBody Recruiter recruiter) {
        Optional<Recruiter> existingRecruiter = recruiterRepository.findById(id);
        if (existingRecruiter.isPresent()) {
            recruiter.setId(id);
            return recruiterRepository.save(recruiter);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recruiter not found");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteRecruiter(@PathVariable Long id) {
        Optional<Recruiter> recruiter = recruiterRepository.findById(id);
        if (recruiter.isPresent()) {
            recruiterRepository.delete(recruiter.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recruiter not found");
        }
    }

    @GetMapping
    public Iterable<Recruiter> getAllRecruiters() {
        return recruiterRepository.findAll();
    }
}
