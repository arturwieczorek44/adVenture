package adventure.adventure.controllers;

import adventure.adventure.entities.Skill;
import adventure.adventure.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    @Autowired
    private SkillRepository skillRepository;

    @GetMapping("/{id}")
    public Skill getSkillById(@PathVariable Long id) {
        Optional<Skill> skill = skillRepository.findById(id);
        if (skill.isPresent()) {
            return skill.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Skill not found");
        }
    }

    @PostMapping
    public Skill createSkill(@RequestBody Skill skill) {
        return skillRepository.save(skill);
    }

    @PutMapping("/{id}")
    public Skill updateSkill(@PathVariable Long id, @RequestBody Skill skill) {
        Optional<Skill> existingSkill = skillRepository.findById(id);
        if (existingSkill.isPresent()) {
            skill.setId(id);
            return skillRepository.save(skill);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Skill not found");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable Long id) {
        Optional<Skill> skill = skillRepository.findById(id);
        if (skill.isPresent()) {
            skillRepository.delete(skill.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Skill not found");
        }
    }

    @GetMapping
    public Iterable<Skill> getAllSkills() {
        return skillRepository.findAll();
    }
}