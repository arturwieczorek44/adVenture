package adventure.adventure.sandbox;

import adventure.adventure.entities.Candidate;
import adventure.adventure.entities.JobOffer;
import adventure.adventure.repositories.CandidateRepository;
import adventure.adventure.repositories.JobOfferRepository;
import adventure.adventure.utilities.DegreesOfEducation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class Start {
    //to jest utworzone tylko w ramach testów jbc
    private final CandidateRepository candidateRepository;
    private final JobOfferRepository jobOfferRepository;
    @Autowired
    public Start (CandidateRepository candidateRepository, JobOfferRepository jobOfferRepository){
        this.candidateRepository= candidateRepository;
        this.jobOfferRepository = jobOfferRepository;
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
        JobOffer jobOffer = new JobOffer(5L,"Rolnik","żyje z dotacji","Brak","Kraków",1550,new Date(2000, 11, 21));
        jobOfferRepository.save(jobOffer);
        System.out.println(jobOffer);



    }
}

