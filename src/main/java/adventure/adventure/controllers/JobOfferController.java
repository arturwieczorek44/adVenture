package adventure.adventure.controllers;

import adventure.adventure.entities.Candidate;
import adventure.adventure.entities.JobOffer;
import adventure.adventure.repositories.JobOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/api/joboffer")
public class JobOfferController {

    @Autowired
    private JobOfferRepository jobOfferRepository;


    @GetMapping("/{id}")
    public JobOffer getJobOfferById(@PathVariable Long id)
    {
        Optional<JobOffer> jobOffer = jobOfferRepository.findById(id);

        if (jobOffer.isPresent())
        {
            return jobOffer.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Job Offer Not Found");
        }
    }

    @PostMapping
    public JobOffer createJobOffer(@RequestBody JobOffer jobOffer) {
        return jobOfferRepository.save(jobOffer);
    }

    @PutMapping("/{id}")
    public JobOffer updateJobOffer(@PathVariable Long id, @RequestBody JobOffer jobOffer) {
        Optional<JobOffer> existingJobOffer = jobOfferRepository.findById(id);

        if(existingJobOffer.isPresent())
        {
            return jobOfferRepository.save(existingJobOffer.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Job Offer Not Found");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteJobOffer(@PathVariable Long id) {
        Optional<JobOffer> existingJobOffer = jobOfferRepository.findById(id);

        if(existingJobOffer.isPresent()) {
            jobOfferRepository.delete(existingJobOffer.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Job Offer Not Found");
        }
    }

    @GetMapping
    public Iterable<JobOffer> getAllCandidates() {
        return jobOfferRepository.findAll();
    }

}
