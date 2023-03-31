package adventure.adventure.controllers;

import adventure.adventure.entities.Employment;
import adventure.adventure.repositories.EmploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/api/employments")
public class EmploymentController {

    @Autowired
    private EmploymentRepository employmentRepository;

    @GetMapping("/{id}")
    public Employment getEmploymentById(@PathVariable Long id) {
        Optional<Employment> employment = employmentRepository.findById(id);
        if (employment.isPresent()) {
            return employment.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employment not found");
        }
    }

    @PostMapping
    public Employment createEmployment(@RequestBody Employment employment) {
        return employmentRepository.save(employment);
    }

    @PutMapping("/{id}")
    public Employment updateEmployment(@PathVariable Long id, @RequestBody Employment employment) {
        Optional<Employment> existingEmployment = employmentRepository.findById(id);
        if (existingEmployment.isPresent()) {
            employment.setId(id);
            return employmentRepository.save(employment);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employment not found");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteEmployment(@PathVariable Long id) {
        Optional<Employment> employment = employmentRepository.findById(id);
        if (employment.isPresent()) {
            employmentRepository.delete(employment.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employment not found");
        }
    }

    @GetMapping
    public Iterable<Employment> getAllEmployments() {
        return employmentRepository.findAll();
    }
}
