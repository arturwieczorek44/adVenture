package adventure.adventure.sandbox;

import adventure.adventure.entities.Candidate;
import adventure.adventure.repositories.CandidateRepository;
import adventure.adventure.utilities.DegreesOfEducation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class Start {
    private CandidateRepository candidateRepository;
    @Autowired
    public Start (CandidateRepository candidateRepository){
        this.candidateRepository= candidateRepository;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){
        Candidate candidate1= new Candidate(1L,"Wojciech","Krzysztoszowski","wkk@pw.lp","997", DegreesOfEducation.DOCTORATE,"mobing");
        Candidate candidate2= new Candidate(2L,"Ola","Kordas","kko@pw.lp","991", DegreesOfEducation.PRIMARY_EDUCATED,"most popular elblag influencer");
        Candidate candidate3= new Candidate(3L,"Suchol","Wojciechowski","sks@pw.un","995", DegreesOfEducation.DOCTORATE,"konon");
        candidateRepository.save(candidate1);
        candidateRepository.save(candidate2);
        candidateRepository.save(candidate3);
        Iterable<Candidate> allCandidatesBeforeDelete = candidateRepository.findAll();
        System.out.println("Database before delete, Candidate's records:");
        allCandidatesBeforeDelete.forEach(System.out::println);
        candidateRepository.deleteById(3L);
        Iterable<Candidate> allCandidates = candidateRepository.findAll();
        System.out.println("Current database Candidate's records:");
        allCandidates.forEach(System.out::println);



    }
}

