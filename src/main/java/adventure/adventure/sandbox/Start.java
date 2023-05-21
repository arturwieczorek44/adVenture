package adventure.adventure.sandbox;

import adventure.adventure.entities.*;
import adventure.adventure.repositories.*;
import adventure.adventure.utilities.DegreesOfEducation;
import adventure.adventure.utilities.DegreesOfRecruiters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class Start {
    //to jest utworzone tylko w ramach testów jbc
    private final CandidateRepository candidateRepository;
    private final JobOfferRepository jobOfferRepository;
    private final RecruiterRepository recruiterRepository;
    private final InterviewRepository interviewRepository;

    private final SkillRepository skillRepository;
    private final EmploymentRepository employmentRepository;
    @Autowired
    public Start (CandidateRepository candidateRepository, JobOfferRepository jobOfferRepository, RecruiterRepository recruiterRepository, InterviewRepository interviewRepository, SkillRepository skillRepository, EmploymentRepository employmentRepository){
        this.candidateRepository= candidateRepository;
        this.jobOfferRepository = jobOfferRepository;
        this.recruiterRepository = recruiterRepository;
        this.interviewRepository = interviewRepository;
        this.skillRepository= skillRepository;
        this.employmentRepository = employmentRepository;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){
//        Candidate candidate1= new Candidate("Wojciech","Krzysztoszowski","wkk@pw.lp","997", DegreesOfEducation.DOCTORATE,"mobing");
//        Candidate candidate2= new Candidate("Ola","Kordas","kko@pw.lp","991", DegreesOfEducation.PRIMARY_EDUCATED,"most popular elblag influencer");
//        Candidate candidate3= new Candidate("Suchol","Wojciechowski","sks@pw.un","995", DegreesOfEducation.DOCTORATE,"konon");
//        candidateRepository.save(candidate1);
//        candidateRepository.save(candidate2);
//        candidateRepository.save(candidate3);
//        Iterable<Candidate> allCandidatesBeforeDelete = candidateRepository.findAll();
//        System.out.println("Database before delete, Candidate's records:");
//        allCandidatesBeforeDelete.forEach(System.out::println);
//        candidateRepository.deleteById(3L);
//        Iterable<Candidate> allCandidates = candidateRepository.findAll();
//        System.out.println("Current database Candidate's records:");
//        allCandidates.forEach(System.out::println);
//
//       JobOffer jobOffer = new JobOffer("Rolnik","żyje z dotacji","Brak","Kraków",1550,(LocalDate.now()));
//        jobOfferRepository.save(jobOffer);
//        System.out.println(jobOffer);
//
//        Recruiter recruiter1 = new Recruiter("jacek","muranski","12345","123@12.pl", DegreesOfRecruiters.YOUNGER_RECRUITER);
//        recruiterRepository.save(recruiter1);
//        System.out.println(recruiter1);
//
//        Interview interview = new Interview((LocalDate.now()),"bla",true);
//        interviewRepository.save(interview);
//
//        Skill skill = new Skill("szydelkowanie");
//        skillRepository.save(skill);
//
//        Employment employment = new Employment("FirmaW","kierownik",(LocalDate.now()),(LocalDate.of(2035,12,15)));
//        employmentRepository.save(employment);
//
//
//
//
//
//






    }
}

